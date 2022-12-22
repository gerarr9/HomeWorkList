import java.util.Objects;

public class Product  {
    private  String name;
    private  int cost;
    private  int kg;

    Product(String name,int cost) throws EmptyBlank {
        setName(name);
        setCost(cost);
    }
    Product(String name,int kg,int cost) throws EmptyBlank {
        setName(name);
        setCost(cost);
        setKg(kg);
    }

    public String  getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public int getKg() {
        return kg;
    }

    public void setName(String name) throws EmptyBlank {
        if (name.isEmpty() || name.isBlank()){
            throw new EmptyBlank("Заполните блан полностью");
        }
        this.name = name;
    }

    public void setCost(int cost) throws EmptyBlank {
        if (cost ==0){
            throw new EmptyBlank("Заполните блан полность. 0 вводить нельзя");
        }
        this.cost = cost;
    }

    public void setKg(int kg) throws EmptyBlank {
        if (kg ==0){
            throw new EmptyBlank("Заполните блан полность. 0 вводить нельзя");
        }
        this.kg = kg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return cost == product.cost && kg == product.kg && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cost, kg);
    }

    @Override
    public String toString() {
        return name +" "+ kg+" килограмма за "+cost+" рублей";
    }

}
