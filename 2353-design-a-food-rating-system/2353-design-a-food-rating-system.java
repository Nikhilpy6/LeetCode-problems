class FoodRatings {
    private Map<String, Integer> foodrating = new HashMap<>();
    private Map<String, String> foodcuisine = new HashMap<>();
    private Map<String, TreeSet<Pair<Integer, String>>> cuisineratings_food = new HashMap<>();
  

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
         for (int i = 0; i < foods.length; ++i) {
            foodrating.put(foods[i], ratings[i]);
            foodcuisine.put(foods[i], cuisines[i]);

            cuisineratings_food
                .computeIfAbsent(cuisines[i], k -> new TreeSet<>((a, b) -> {
                    int compareByRating = Integer.compare(a.getKey(), b.getKey());
                    if (compareByRating == 0) {
                        return a.getValue().compareTo(b.getValue());
                    }
                    return compareByRating;
                }))
                .add(new Pair(-ratings[i], foods[i]));
        }
    }
    
    public void changeRating(String food, int newRating) {
        String cuisineName = foodcuisine.get(food);
        TreeSet<Pair<Integer, String>> cuisineSet = cuisineratings_food.get(cuisineName);
        Pair<Integer, String> oldElement = new Pair<>(-foodrating.get(food), food);
        cuisineSet.remove(oldElement);
        foodrating.put(food, newRating);
        cuisineSet.add(new Pair<>(-newRating, food));
    }
    
    public String highestRated(String cuisine) {
         Pair<Integer, String> highestRated = cuisineratings_food.get(cuisine).first();
        return highestRated.getValue();
    }
}

/**
 * Your FoodRatings object will be instantiated and called as such:
 * FoodRatings obj = new FoodRatings(foods, cuisines, ratings);
 * obj.changeRating(food,newRating);
 * String param_2 = obj.highestRated(cuisine);
 */