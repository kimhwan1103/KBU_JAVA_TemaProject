public class monster {
    public static void main(String args[]){

    }
}
//추상 팩토리 패턴으로 진행
interface Monster{} //몬스터 인터페이스 생성

abstract class RaidMonster implements Monster{} //몬스터를 상속하고 레이드몬스터 추상 클래스 생성
abstract class MiniMonster implements Monster{} //몬스터를 상속하고 미니몬스터 추상 클래스 생성
abstract class BigMonster implements Monster{} //몬스터를 상속하고 빅몬스터 추상 클래스 생성

class RaidMonsterDamage extends RaidMonster{
    private int BaseDamage = 250; //레이드몬스터 기본 공격 데미지

}
class MiniMonsterDamage extends MiniMonster{
    private int BaseDamage = 50; //미니몬스터 기본 공격 데미지
}
class BigMonsterDamage extends BigMonster{
    private int BaseDamage = 100; //빅몬스터의 기본 공격 데미지
}

interface MonsterFactory { //몬스터팩토리 인터페이스 생성
    RaidMonster createRaidMonster();
    MiniMonster createMiniMonster();
    BigMonster createBigMonster();
}

//몬스터팩토리를 상속하고 고블린팩토리 클래스 생성
class GoblinMonsterFactory implements MonsterFactory {
    @Override
    public RaidMonster createRaidMonster() {
        return new RaidMonsterDamage(); //레이드몬스터 공격 데미지 리턴
    }

    @Override
    public MiniMonster createMiniMonster() {
        return new MiniMonsterDamage(); //미니몬스터 공격 데미지 리턴
    }

    @Override
    public BigMonster createBigMonster() {
        return new BigMonsterDamage(); //빅몬스터 공격 데미지 리턴
    }
}

class OakMonsterFactory implements MonsterFactory{
    @Override
    public RaidMonster createRaidMonster(){
        return new RaidMonsterDamage(); //레이드몬스터 공격 데미지 리턴
    }

    @Override
    public MiniMonster createMiniMonster(){
        return new MiniMonsterDamage(); //미니몬스터 공격 데미지 리턴
    }

    @Override
    public BigMonster createBigMonster(){
        return new BigMonsterDamage(); //빅몬스터 공격 데미지 리턴
    }
}