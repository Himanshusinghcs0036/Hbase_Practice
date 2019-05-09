public class ProjectException {
    public static void printException(Exception ex){
        System.out.println("||||||||||||||||||");
        System.out.println("||||   ||||   ||||");
        System.out.println("||||   ||||   ||||");
        System.out.println("||||   ||||   ||||");
        System.out.println("||||||||||||||||||");
        System.out.println("||||   ||||   ||||");
        System.out.println("||||   ||||   ||||");
        System.out.println("||||   ||||   ||||");
        System.out.println("||||||||||||||||||");
        System.out.println("Exception while Scanning object");
        System.out.println(ex.getMessage());
        System.out.println(ex.getCause());
    }

}
