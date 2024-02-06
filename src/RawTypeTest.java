public class RawTypeTest <E>{
    private E item;

    public void setItem(E item) {
        this.item = item;
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void main(String[] args) {
        RawTypeTest rawTypeTest = new RawTypeTest<>();
        rawTypeTest.setItem("Hello");
    }
}
