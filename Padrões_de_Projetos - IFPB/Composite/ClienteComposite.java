import java.util.List;
import java.util.ArrayList;

/** "Component" **/
interface Graphic {

    //Printa o grafico.
    public void print();
    public double area();
    public double perimetro();
}

/** "Composite" **/
class CompositeGraphic implements Graphic {

    //Coleção de Graficos  filhos
    private List<Graphic> childGraphics = new ArrayList<Graphic>();

    //Printa o grafico
    public void print() {
        for (Graphic graphic : childGraphics) {
            graphic.print();
        }
    }

    public double area() {
        double area_todo = 0;
        for (Graphic graphic : childGraphics) {
            area_todo += graphic.area();

        }
        return(area_todo);
    }

    public double perimetro() {
        double perimetro_todo = 0;
        for (Graphic graphic : childGraphics) {
            perimetro_todo += graphic.perimetro();

        }
        return(perimetro_todo);
    }

    //Adiciona o grafico a composição.
    public void add(Graphic graphic) {
        childGraphics.add(graphic);
    }
    //Remove a forma geometrica da composição.
    public void remove(Graphic graphic) {
        childGraphics.remove(graphic);
    }

}

/** "Leaf" **/
class Ellipse implements Graphic {
    //Printa o grafico.
    public void print() {
        System.out.println("Ellipse");
    }
    public double area() {
        return(2);
    }
    public double perimetro() {
        return(3.12);
    }
}

/** "Leaf" **/
class Circle implements Graphic {
    //Printa o grafico.
    public void print() {
        System.out.println("Circle");
    }
    public double area() {
        return(3.1415);
    }
    public double perimetro() {
        return(6.283);
    }
}

/** "Leaf" **/
class Losangulo implements  Graphic{
    //Printa o grafico.
    public void print() {
        System.out.println("Losangulo");
    }
    public double area() {
        return(6);
    }
    public double perimetro() {
        return(10);
    }
}

/** "Leaf" **/
class Retangulo implements  Graphic{
    //Printa o grafico.
    public void print() {
        System.out.println("Retangulo");
    }
    public double area() {
        return(8);
    }
    public double perimetro() {
        return(12);
    }
}

/** Client **/
public class ClienteComposite{
    public static void main(String[] args) {
        //Inicializa quatro elipses
        Ellipse ellipse1 = new Ellipse();
        Ellipse ellipse2 = new Ellipse();
        Ellipse ellipse3 = new Ellipse();
        Ellipse ellipse4 = new Ellipse();

        //Inicializa tres componentes do grafico.
        CompositeGraphic graphic = new CompositeGraphic();
        CompositeGraphic graphic1 = new CompositeGraphic();
        CompositeGraphic graphic2 = new CompositeGraphic();

        //Faz o grafico
        graphic1.add(ellipse1);
        graphic1.add(ellipse2);
        graphic1.add(ellipse3);

        System.out.println("Graphic1 Area: " + graphic1.area());
        graphic2.add(ellipse4);
        System.out.println("Graphic2 Area: " + graphic2.area());

        graphic.add(graphic1);
        graphic.add(graphic2);
        graphic.add(new Circle());
        // Printa quatro vezes a String Ellipse ( Ele printa o grafico completo).
        graphic.print();

        System.out.println("Graphic Area: " + graphic.area());

        System.out.println("\nNovas Formas:\n");

        //Inicializa formas geometricas novas
        Losangulo losangulo = new Losangulo();
        Losangulo losangulo_2 = new Losangulo();
        Retangulo retangulo = new Retangulo();
        Retangulo retangulo_2 = new Retangulo();
        Retangulo retangulo_3 = new Retangulo();


        //Inicializa  um novo grafico
        CompositeGraphic graphic3 = new CompositeGraphic();
        CompositeGraphic graphic4 = new CompositeGraphic();
        CompositeGraphic graphic5 = new CompositeGraphic();

        //Faz o grafico
        graphic3.add(losangulo);
        graphic3.add(losangulo_2);
        graphic3.print();

        System.out.println("Graphic3 Area: " + graphic3.area());
        System.out.println("Graphic3 Perimetro: " + graphic3.perimetro());

        graphic4.add(retangulo);
        graphic4.add(retangulo_2);
        graphic4.add(retangulo_3);

        graphic4.print();

        System.out.println("Graphic4 Area: " + graphic4.area());
        System.out.println("Graphic4 Perimetro: " + graphic4.perimetro());

        //Juntando grafico
        graphic5.add(graphic);
        graphic5.add(graphic3);
        graphic5.add(graphic4);

        graphic5.print();
        System.out.println("Graphic5 Area: " + graphic5.area());
        System.out.println("Graphic5 perimetro: " + graphic5.perimetro());
    }
}
