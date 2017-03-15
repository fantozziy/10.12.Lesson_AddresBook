public class Main {

    public static void main(String[] args) {
        // Телефонный справочник
        HomePhone homePhone = new HomePhone("334-67-80", "Минск");
        MobilePhone mobilePhone = new MobilePhone("+375 25 7680909", "MTS");

        Contact contact1 = new Contact("Вася ", "Петров ", homePhone, mobilePhone);

        HomePhone homePhone2 = new HomePhone("224-55-18", "Могилёв");
        MobilePhone mobilePhone2 = new MobilePhone("+375 44 7680099", "Velcom");

        Contact contact2 = new Contact("Вова ", "Иванов ", homePhone2, mobilePhone2);

        String[] strs = new String[] {contact1.toString(), contact2.toString()};

        InputOutputData.writeDataToFile("textFile.txt", strs);
    }
}
