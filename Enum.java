class Enum{
    public enum Season{WINTER,SUMMER,SPRING,FALL}
    public static void main(String[] args){
        for (Season s : Enum.Season.values())
        System.out.println(s);
    }
}