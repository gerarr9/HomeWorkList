import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Recipe  {
  private   List<Product> products;
  private   int fullCost =0;
  protected  String nameRecipe;


  public Recipe(String nameRecipe ) throws EmptyBlank {
    this.products = new ArrayList<>();
    setNameRecipe(nameRecipe);

  }

  public String getNameRecipe() {
    return nameRecipe;
  }

  public void setNameRecipe(String nameRecipe) throws EmptyBlank {
    this.nameRecipe = nameRecipe;
  }

  public void addProduct(Product product, int kg){
    products.add(product);
    this.fullCost += product.getCost() * kg;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Recipe recipe = (Recipe) o;
    return Objects.equals(nameRecipe, recipe.nameRecipe);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nameRecipe);
  }

  @Override
  public String toString() {
    return "Рецепт "+getNameRecipe()+" - стоимость "+fullCost;
  }
}
