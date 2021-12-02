public class spec {
 // 정적 공간 : 싱글턴 패턴 구현이 담긴 공간 !!!건들면 안됨!!!
    private spec () {}; // private 생성자 선언
    private static spec spec = null; // spec의 정적공간을 null로 초기화

    public static spec getSpec(){
        if ( spec == null ){ // 최초에 한번 메서드가 불려질때 null일 경우
            spec = new spec(); // 인스턴스 생성
        }
        return spec; // 반환
    }
    
 // 동적 공간 : 추가될 수 있는 값 (불러올 수 있는 값 : health, mana, level, name)
    private int health = 500; // 기초체력
    private int mana = 100; // 기초마나
    private int level = 1; // 기초레벨
    private String name  = ""; // 이름
    private String job = ""; // 현직업

    public int getHealth () { return health; } // 불려가는 값의 반환
    public int getMana () { return mana; }
    public int getLevel () { return level; }
    public String getName () { return name; }
    public String getJob () { return job; }

    public void setHealth ( int _health ) {
        health = _health; } 
    public void setMana ( int _mana ) {
        mana = _mana; } 
    public void setLevel ( int _level ) {
        level = _level; } 
    public void setName ( String _name ) {
        name = _name; } 
    public void setJob ( String _job ) {
        job = _job; } 
}