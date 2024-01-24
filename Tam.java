class Tam {
    public static void main(String args[]) {

        Singleton x = Singleton.getInstance();
        Singleton y = Singleton.getInstance();
        Singleton z = Singleton.getInstance();
        System.out.println("hashcode of x:" + x.hashCode());
        System.out.println("hashcode of y:" + y.hashCode());
        System.out.println("hashcode of z:" + z.hashCode());
    }
}