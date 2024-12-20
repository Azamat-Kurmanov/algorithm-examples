package kz.jgarant.dit.simpleexample1;

public class Example3 {
    public static void main(String[] args) {
//        int размер_шарика=100;
//        for (int дуть_в_шар = 1; дуть_в_шар <= 10; дуть_в_шар++) {
//            int proizvedenie = дуть_в_шар * размер_шарика;
//            System.out.println("Произведение суммы " +дуть_в_шар+" * "+размер_шарика+" =" + proizvedenie);
//        }

        crudAlgorithms();
    }

    private static void crudAlgorithms() {
        int arrSize = 100;
        OrdArray array = new OrdArray(arrSize);
//        array.insertInOrder(77);
//        array.insertInOrder(99);
//        array.insertInOrder(44);
//        array.insertInOrder(55);
//        array.insertInOrder(22);
//        array.insertInOrder(88);
//        array.insertInOrder(11);
//        array.insertInOrder(0);
//        array.insertInOrder(66);
//        array.insertInOrder(33);

        array.insertInOppositeOrder(77);
        array.insertInOppositeOrder(99);
        array.insertInOppositeOrder(44);
        array.insertInOppositeOrder(55);
        array.insertInOppositeOrder(22);
        array.insertInOppositeOrder(88);
        array.insertInOppositeOrder(11);
        array.insertInOppositeOrder(0);
        array.insertInOppositeOrder(66);
        array.insertInOppositeOrder(33);

        int searchKey = 55;
        if (array.find(searchKey) != array.size()){
            System.out.println("Found " + searchKey);
        } else {
            System.out.println("Can't find " + searchKey);
        }

        array.display();

        array.delete(0);
        array.delete(55);
        array.delete(99);

        array.display();
    }
}


