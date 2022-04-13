public abstract class AbstractClass {
    public final void  CookProcess() {
        pourOil();
        heatOil();
        pourVegetable();
        pourSauce();
        fry();

    }

    public void pourOil() {
        System.out.println("倒油");
    }

    //热油一样
    public void heatOil() {
        System.out.println("热油");

    }
    //道菜不一样
    public abstract void pourVegetable();
    //带料不一样
    public abstract void pourSauce();
    //加热一样
    public void fry() {
        System.out.println("炒熟");

    }

}
