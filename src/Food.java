class Food {
    private String name;
    private int calories;

    public Food(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public String getFoodInfo() {
        return "Food: " + name + ", Calories: " + calories;
    }

    @Override
    public String toString() {
        return "Food [name=" + name + ", calories=" + calories + "]";
    }

    @Override
    public int hashCode() {
        return name.hashCode() + Integer.hashCode(calories);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Food food = (Food) obj;
        return calories == food.calories && name.equals(food.name);
    }
}
