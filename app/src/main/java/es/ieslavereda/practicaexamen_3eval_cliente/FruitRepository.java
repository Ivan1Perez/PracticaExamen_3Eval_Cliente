package es.ieslavereda.practicaexamen_3eval_cliente;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FruitRepository {

    private List<Fruit> fruits;
    private static FruitRepository instance;

    public FruitRepository(){
        fruits = new ArrayList<>();
        fruits.add(new Fruit("Aguacate", "5,73/kg", "Viernes", R.drawable.aguacate));
        fruits.add(new Fruit("Arándano", "12,01/kg", "Miércoles", R.drawable.arandanos));
        fruits.add(new Fruit("Cereza","6,75/kg", "Jueves", R.drawable.cereza));
        fruits.add(new Fruit("Fresa", "4,38/kg", "Viernes", R.drawable.fresa));;
        fruits.add(new Fruit("Limón", "2,38/kg", "Jueves", R.drawable.limon));
        fruits.add(new Fruit("Mango", "6,65/kg", "Domingo", R.drawable.mango));
        fruits.add(new Fruit("Manzana", "1,99/kg", "Martes", R.drawable.manzanar));
        fruits.add(new Fruit("Melocotón", "4,95/kg", "Lunes", R.drawable.melocoton));
        fruits.add(new Fruit("Melón", "1,79/kg", "Sábado", R.drawable.melon));
        fruits.add(new Fruit("Naranja", "2,44/kg", "Domingo", R.drawable.naranja));
        fruits.add(new Fruit("Pera", "2,25/kg", "Martes", R.drawable.pera));
        fruits.add(new Fruit("Piña", "3,64/kg", "Viernes", R.drawable.pinya));
        fruits.add(new Fruit("Plátano", "2,99/kg", "Jueves", R.drawable.platano));
    }

    public static FruitRepository getInstance(){
        if(instance == null)
            instance = new FruitRepository();

        return instance;
    }

    public Fruit getFruit(int index){
        return fruits.get(index);
    }

    public void remove(Fruit f){
        fruits.remove(f);
    }

    public void add(Fruit f){
        fruits.add(f);
    }

    public void addInSpecificPosition(Fruit f, int index){
        fruits.add(index,f);
    }

    public int getSize(){
        return fruits.size();
    }

    public void sort(Comparator c){
        Collections.sort(fruits, c);
    }

    

}
