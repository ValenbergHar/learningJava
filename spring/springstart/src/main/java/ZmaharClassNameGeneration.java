public class ZmaharClassNameGeneration implements ClassNameGenerator{
    public String generateClassName() {
        String[] names = {"Pazniak", "Sapieha", "Luckievich","Batory" };
        return names[(int)(Math.random()*4)];
    }
}
