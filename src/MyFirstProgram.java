public class MyFirstProgram {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Next Comment");
        //manggil method
        myFavoriteFood();
        myFavoritePlace();
        myFavoriteGames();
    }

    // ini method
    public static void myFavoriteFood(){
        System.out.println("makanan favorit:");
        System.out.println("1. Mie");
        System.out.println("2. Kentang");
        System.out.println("3. Tahu");
    }

    public static void myFavoritePlace(){
        System.out.println("tempat favorit");
        System.out.println("1. BIP");
        System.out.println("2. Alam Sunda");
        System.out.println("3. Kasur");
    }

    public static void myFavoriteGames(){
        System.out.println("game favorite");
        System.out.println("1. MLBB");
        System.out.println("2. MLA");
        System.out.println("3. MaiMai");
    }
}