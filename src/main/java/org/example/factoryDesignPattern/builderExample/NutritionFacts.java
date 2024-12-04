package org.example.factoryDesignPattern.builderExample;

public class NutritionFacts {

    private final int servingSize;
    private final int calories;
    private final int servings;
    private final int carbohydrates;
    private final int sodium;
    private final int fat;

    public static class Builder {
        private final int servingSize;
        private final int servings;

        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrates = 0;

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(int val) {
            calories = val;
            return this;
        }
        public Builder fat (int val) {
            fat = val;
            return this;
        }
        public Builder sodium (int val) {
            sodium = val;
            return this;
        }
        public Builder carbohydrates (int val) {
            carbohydrates = val;
            return this;
        }
        private NutritionFacts (Builder builder) {
            this.servingSize = builder.servingSize;
            this.servings = builder.servings;
            this.calories = builder.calories;
            this.fat = builder.fat;
            this.sodium = builder.sodium;
            this.carbohydrates = builder.carbohydrates;
        }


    }
}
