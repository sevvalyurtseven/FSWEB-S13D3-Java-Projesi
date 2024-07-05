public class Wall {
    //INSTANCE VARIABLE:
    //private sayesinde bu width ve height degerlerine
    // benim dısımda kimse erisemez. (ENCAPSULATION). Yani baska bir class'da
    // direkt olarak width degerine erismemi engelliyor.
     private double width;
     private double height;


    //CONSTRUCTOR:

    public Wall(double width, double height){
        this.height = height < 0 ? 0 : height;
        this.width = width < 0 ? 0 : width;
    }

    //WALL SINIFI ICIN METHODLARIMIZ

    public double getWidth(){
        return this.width;
    }

    public double getHeight(){
        return this.height;
    }

    //NOT: VOID'LERIN RETURN DEGERI YOKTUR!

    public void setWidth(double width){
        this.width = width < 0 ? 0 : width;
    }

    public void setHeight(double height){
        this.height = height < 0 ? 0 : height;
    }

    public double getArea(){
        return this.height * this.width;
    }
}

//NOT: Statik bir methodu statik olmayan bir methodun içerisinde çağırabilirim.
// Ama statik olan bir methodun içerisinde herhangi bir statik olmayan bisey
// cagiramam! this keyword'ünü de statik bir method içerisinde kullanamam!
