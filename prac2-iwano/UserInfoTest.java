class UserInfoTest {
    public static void main(String[] args) {
        UserInfo ui = new UserInfo("Alice");
        System.out.println(ui);
        System.out.println(ui.getInitials());
        System.out.println();

        UserInfo fui = new FullUserInfo("Alice", "Miller");
        System.out.println(fui);
        System.out.println(fui.getInitials());
    }
}
