import java.util.*;
// Base interface for all meal plans
interface MealPlan {
    String getMealType();
    List<String> getItems();
}

//vegetarian meal
class VegetarianMeal implements MealPlan {
    @Override
    public String getMealType() {
        return "Vegetarian";
    }

    @Override
    public List<String> getItems() {
        List<String> items = new ArrayList<>();
        items.add("Paneer");
        items.add("Dal");
        items.add("Rice");
        return items;
    }
}

//vegan meal
class VeganMeal implements MealPlan {
    @Override
    public String getMealType() {
        return "Vegan";
    }

    @Override
    public List<String> getItems() {
        List<String> items = new ArrayList<>();
        items.add("Tofu");
        items.add("Beans");
        items.add("Salad");
        return items;
    }
}

//keto meal
class KetoMeal implements MealPlan {
    @Override
    public String getMealType() {
        return "Keto";
    }

    @Override
    public List<String> getItems() {
        List<String> items = new ArrayList<>();
        items.add("Eggs");
        items.add("Cheese");
        items.add("Avocado");
        return items;
    }
}

//high-protein meal
class HighProteinMeal implements MealPlan {
    @Override
    public String getMealType() {
        return "High-Protein";
    }

    @Override
    public List<String> getItems() {
        List<String> items = new ArrayList<>();
        items.add("Chicken");
        items.add("Lentils");
        items.add("Greek Yogurt");
        return items;
    }
}

//generic class with bounded type parameter
class Meal<T extends MealPlan> {
    private T mealPlan;
    public Meal(T mealPlan) {
        this.mealPlan = mealPlan;
    }

    public T getMealPlan() {
        return mealPlan;
    }
}

public class MealPlanGenerator {
    public static void main(String[] args) {
        Meal<VegetarianMeal> vegetarianMeal = new Meal<>(new VegetarianMeal());
        Meal<VeganMeal> veganMeal = new Meal<>(new VeganMeal());
        Meal<KetoMeal> ketoMeal = new Meal<>(new KetoMeal());
        Meal<HighProteinMeal> highProteinMeal = new Meal<>(new HighProteinMeal());

        //generate meal plans using generic method
        generateMealPlan(vegetarianMeal.getMealPlan());
        generateMealPlan(veganMeal.getMealPlan());
        generateMealPlan(ketoMeal.getMealPlan());
        generateMealPlan(highProteinMeal.getMealPlan());
    }

    //generic method to validate and generate meal plan
    public static <T extends MealPlan> void generateMealPlan(T mealPlan) {

        if (mealPlan == null) {
            System.out.println("Invalid meal plan.");
            return;
        }

        System.out.println("Meal Type: " + mealPlan.getMealType());
        System.out.println("Included Items:");

        for (String item : mealPlan.getItems()) {
            System.out.println("- " + item);
        }
    }
}


