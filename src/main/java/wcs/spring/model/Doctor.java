package wcs.spring.model;

public class Doctor {

    // déclaration de variables d'instance

    private int number;
    private String name;

    // constructeur, getter et setter

    /**
     * Spécification du constructeur Doctor avec deux paramètres d'instances
     * Doctor constructor specification with two instance parameters
     * Angabe des Konstruktors Doctor mit zwei Instanzparametern
     * 有两个实例参数的博士构造函数规范
     * 2つのインスタンス・パラメータを持つドクター・コンストラクタ仕様
     * @param number l'identifiant du docteur, the doctor's ID, die ID des Arztes, 医生的标识符, 医師の識別子
     * @param name le nom du docteur, the doctor's name, der Name des Arztes, 医生的名字, 医師名
     */
    public Doctor(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
