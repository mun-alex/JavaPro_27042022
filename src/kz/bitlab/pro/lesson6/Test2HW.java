package kz.bitlab.pro.lesson6;

public class Test2HW {
    public static void main(String[] args) {
        Workers staff1 = new Staff(1, "John", "Smith", 2000);
        Workers staff2 = new Staff(2, "Barbara", "Wood", 2500);
        Workers staff3 = new Staff(3, "Max", "Pain", 3000);
        Workers staff4 = new Staff(4, "Siora", "Banga", 2350);
        Workers staff5 = new Staff(5, "Wolf", "Ladovsky", 4000);

        Workers hrman1 = new HRManagers(1, "Lukas Podolsky", 5000);
        Workers hrman2 = new HRManagers(2, "Mikky Mouse", 3000);
        Workers hrman3 = new HRManagers(3, "Tom Jerry", 4000);
        Workers hrman4 = new HRManagers(4, "Franz Wuttke", 5000);
        Workers hrman5 = new HRManagers(5, "Chritstoph Muller", 2000);

        Workers programmer1 = new Programmers(1, "darkman", 4000, 1000, 0.8);
        Workers programmer2 = new Programmers(2, "hacker", 5000, 3000, 0.3);
        Workers programmer3 = new Programmers(3, "root", 2520, 2000, 0.7);
        Workers programmer4 = new Programmers(4, "freeman", 5000, 1200, 0.5);
        Workers programmer5 = new Programmers(5, "profi", 4000, 1000, 0.9);

        Workers[] workers = new Workers[]{
                staff1, staff2, staff3, staff4, staff5,
                hrman1, hrman2, hrman3, hrman4, hrman5,
                programmer1, programmer2, programmer3, programmer4, programmer5};

        System.out.println(getWorkerWithBestSalary(workers).getWorkerData());

        sortWorkers(workers);
        for (Workers worker : workers) {
            System.out.println(worker.getWorkerData());
        }
    }

    public static Workers getWorkerWithBestSalary (Workers[] workers) {
        Workers workerWithBestSalary = workers[0];
        for (int i = 1; i < workers.length; i++) {
            if (workers[i].getSalary() > workerWithBestSalary.getSalary()) workerWithBestSalary = workers[i];
        }
        return workerWithBestSalary;
    }

    public static Workers[] sortWorkers (Workers[] workers) {
        for (int i = 0; i < workers.length - 1; i++) {
            for (int j = 0; j < workers.length - 1; j++) {
                if (workers[j+1].getSalary() > workers[j].getSalary()) {
                    Workers temp = workers[j];
                    workers[j] = workers[j+1];
                    workers[j+1] = temp;
                }
            }
        }
        return workers;
    }
}

interface Workers {
    String getWorkerData();

    int getSalary();
}

class Staff implements Workers {
    private int id;
    private String name;
    private String surname;
    private int salary;

    public Staff() {
    }

    public Staff(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String getWorkerData() {
        return "Staff{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }
}

class HRManagers implements Workers {
    private int id;
    private String fullName;
    private int salary;

    public HRManagers() {
    }

    public HRManagers(int id, String fullName, int salary) {
        this.id = id;
        this.fullName = fullName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String getWorkerData() {
        return "HRManagers{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", salary=" + salary +
                '}';
    }
}

class Programmers implements Workers {
    private int id;
    private String nickname;
    private int salary;
    private int bonusSalary;
    private double KPIValue;

    public Programmers() {
    }

    public Programmers(int id, String nickname, int salary, int bonusSalary, double KPIValue) {
        this.id = id;
        this.nickname = nickname;
        this.salary = salary;
        this.bonusSalary = bonusSalary;
        this.KPIValue = KPIValue;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public int getSalary() {
        return (int) (salary + KPIValue * bonusSalary);
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getBonusSalary() {
        return bonusSalary;
    }

    public void setBonusSalary(int bonusSalary) {
        this.bonusSalary = bonusSalary;
    }

    public double getKPIValue() {
        return KPIValue;
    }

    public void setKPIValue(double KPIValue) {
        this.KPIValue = KPIValue;
    }

    @Override
    public String getWorkerData() {
        return "Programmers{" +
                "id=" + id +
                ", nickname='" + nickname + '\'' +
                ", salary=" + salary +
                ", bonusSalary=" + bonusSalary +
                ", KPIValue=" + KPIValue +
                '}';
    }
}