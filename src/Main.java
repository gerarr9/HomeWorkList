import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.*;

import static javax.swing.UIManager.get;

public class Main {
    public static void main(String[] args) throws EmptyBlank {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Огурец",2,100));
        products.add(new Product("Помидор",1,200));
        products.add(new Product("Картошка",1,50));

        for (int i =0; i<products.size();i++){
                if (i < products.size() -1){
                    for (int j = i+1; j < products.size(); j++) {
                            if (products.get(i).equals(products.get(j))){
                                throw new EmptyBlank("Есть схожие продукты "+"["+ products.get(i)+"]");
                            }
                }
            }
        }
        System.out.println(products);
        Recipe recipe = new Recipe("Окрошка");
        Recipe recipe1 = new Recipe("Салат");
        Product cucumber = new Product("Огурец",1,100);
        Product tomato = new Product("Помидор",1,100);
        Product kolbosa = new Product("Колбоса",1,100);
        recipe.addProduct(cucumber,2);
        recipe.addProduct(tomato,2);
        recipe.addProduct(kolbosa,3);
        recipe1.addProduct(cucumber,2);
        recipe1.addProduct(tomato,1);
        System.out.println(recipe.toString());
        List<Recipe> allRecipe = new ArrayList<>();
        allRecipe.add(recipe);
        allRecipe.add(recipe1);



        System.out.println(allRecipe);

        Random random = new Random();
        List<Integer> nums = new  ArrayList<>(20);
        for (int i=0; i<20;i++){
            nums.add(random.nextInt(1000));
        }
        System.out.println(nums);
        for (int j=0;j<nums.size();j++){
            if (nums.get(j) %2!=0){
                nums.remove(j);
            }
        }
        System.out.println(nums);
        Set<Pupils> pupils = new HashSet<>();

        while (pupils.size() < 15){
            Pupils pupils1 = new Pupils(random.nextInt(9),(random.nextInt(9)));
            pupils.add(pupils1);
            System.out.println(pupils1);
        }
        Set<Passport> passports = new HashSet<>();
        passports.add(new Passport("124","Руслан","Муратов", LocalDate.now().minusYears(25)));
        passports.add(new Passport("124","Буслан","Муратов", LocalDate.now().minusYears(24)));
        System.out.println(passports);
        PassportList passportList = new PassportList(passports);
        System.out.println(passportList);
    }
    }
