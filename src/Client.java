public class Client {
    public static void main(String[] args) {
        AbstractClass baocai = new ConcreteClass_baocai();
        AbstractClass caihua = new ConcreteClass_caihua();
        baocai.CookProcess();
        caihua.CookProcess();
    }
}
