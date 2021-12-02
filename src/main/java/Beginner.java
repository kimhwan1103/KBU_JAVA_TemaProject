import java.util.Scanner;

public class Beginner{  //초보자의 기본 기능 클래스
    public int fistAttack(){
        System.out.println("주먹 지르기!");
        return 5;
    }
    public int kickAttack(){
        System.out.println("발차기!");
        return 10;
    }
    public int recovery(){
        System.out.println("정신 집중!");  //체력 15회복
        return 15;
    }
}

abstract class Hero{
    public abstract int mainWeapon();
    public abstract int assistantWeapon();
    public abstract int shield();
    public abstract int utility();
}

class FirstWarrior extends Hero{
    public int mainWeapon(){
        System.out.println("삼단 베기!");  //1명에게 30의 피해
        return 30;
    }
    public int assistantWeapon(){
        System.out.println("단검 던지기!");  //1명에게 15의 피해
        return 15;
    }
    public int shield(){
        System.out.println("방패 돌진!");  //1명에게 10의 피해
        return 10;
    }
    public int utility(){
        System.out.println("단단한 갑옷! - 방어력이 10상승합니다.");  //받는 데미지가 10 감소
        return 10;
    }
}

class SecondWarrior extends Hero{
    int maindamage = 80;
    public int mainWeapon(){
        System.out.println("회오리 검술!");  //3명의 적에게 50의 피해
        return maindamage;
    }
    public int assistantWeapon(){
        System.out.println("독 바르기! - 검에 독을 바릅니다(공격력 +20)");  //MainWeapon의 데미지가 20상승
        return 20;
    }
    public int shield(){
        System.out.println("방패 내려치기!");  // 5명의 적에게 30의 피해
        return 30;
    }
    public int utility(){
        System.out.println("체력 회복! - HP를 30회복합니다.");  //HP 30 상승
        return 30;
    }
}

class ThirdWarrior extends Hero{
    public int mainWeapon(){
        System.out.println("폭풍의 검술!");  //3명의 적에게 150의 피해
        return 150;
    }
    public int assistantWeapon(){
        System.out.println("단검 흩뿌리기!");  //10명의 적에게 40의 피해
        return 40;
    }
    public int shield(){
        System.out.println("무적!");  //적의 공격 2회를 무효로 만듦
        return 0;
    }
    public int utility(){
        System.out.println("신체 강화! - 방어력+20, 공격력 +20");  //방어력, 공격력 20씩 상승
        return 20;
    }
}

class FirstArcher extends Hero{
    public int mainWeapon(){
        System.out.println("강화 사격!");  //1명의 적에게 40의 피해
        return 40;
    }
    public int assistantWeapon(){
        System.out.println("폭탄 화살 투척!");  //3명의 적에게 20의 피해
        return 20;
    }
    public int shield(){
        System.out.println("질긴 망토!");  //받는 데미지가 10감소
        return 10;
    }
    public int utility(){
        System.out.println("매 부르기!");  //내 턴마다 매가 1명의 적에게 10씩 피해를 줌
        return 10;
    }
}

class SecondArcher extends Hero{
    int maindamage = 80;
    public int mainWeapon(){
        System.out.println("관통 화살!");  //3명의 적에게 80의 피해
        return maindamage;
    }
    public int assistantWeapon(){
        System.out.println("독 화살!");  //화살에 독을 바름. 피해 20 상승
        return 20;
    }
    public int shield(){
        System.out.println("화살 요격!");  //적의 공격을 1회 막으면서 30의 피해를 줌
        return 30;
    }
    public int utility(){
        System.out.println("영양 보충! - 체력 20회복");  //체력을 20회복
        return 20;
    }
}

class ThirdArcher extends Hero{
    public int mainWeapon(){
        System.out.println("화살 폭풍!");  //10명의 적에게 100의 피해
        return 100;
    }
    public int assistantWeapon(){
        System.out.println("불화살 찌르기!");  //1명의 적에게 90의 피해
        return 90;
    }
    public int shield(){
        System.out.println("헤이스트!");  //적의 공격 2회를 회피해서 무효로 만듬
        return 0;
    }
    public int utility(){
        System.out.println("약점 포착! - 공격력 +40");  //공격력 40 상승
        return 40;
    }
}

class FirstWizard extends Hero{
    public int mainWeapon(){
        System.out.println("라이트닝!");  //3명의 적에게 20의 피해
        return 20;
    }
    public int assistantWeapon(){
        System.out.println("얼리기!");  //2명의 적에게 10의 피해를 주고 얼림
        return 10;
    }
    public int shield(){
        System.out.println("얼음 방패!");  //방어력을 10올려줌
        return 10;
    }
    public int utility(){
        System.out.println("MP회복! - MP +40");  //마나를 40회복시킴
        return 40;
    }
}

class SecondWizard extends Hero{
    public int mainWeapon(){
        System.out.println("지진!");  //8명의 적에게 60의 피해
        return 60;
    }
    public int assistantWeapon(){
        System.out.println("파이어 에로우!");  //3명의 적에게 50의 피해
        return 50;
    }
    public int shield(){
        System.out.println("블랙홀 소환!");  //적의 공격 1회를 회피해서 무효로 만듬
        return 0;
    }
    public int utility(){
        System.out.println("기력 충전! - HP +40, MP +40");  //HP와 MP 각각 40씩 회복
        return 40;
    }
}

class ThirdWizard extends Hero{
    public int mainWeapon(){
        System.out.println("메테오!");  //10명의 적에게 120의 피해
        return 120;
    }
    public int assistantWeapon(){
        System.out.println("정신 조작");  //보스가 한턴 동안 공격을 못함
        return 0;
    }
    public int shield(){
        System.out.println("수호신 소환!");  //피해를 받는 만큼 그대로 돌려줌
        return 0;
    }
    public int utility(){
        System.out.println("끝없는 에너지 - MP +60");  //MP 60 회복
        return 60;
    }
}

class MyCharacter extends Beginner{
    Hero hero;
    public void setHero(Hero hero){
        this.hero = hero;
    }
    void mainattcak(){
        hero.mainWeapon();
    }
    void assistantAttack(){
        hero.assistantWeapon();
    }
    void defense(){
        hero.shield();
    }
    void utility(){
        hero.utility();
    }
}


