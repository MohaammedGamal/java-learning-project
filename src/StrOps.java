public class StrOps {

    public String value;

    public StrOps(String s) {

        this.value = s;

    }

    public char [] string_to_array() {

        char [] ch = new char[value.length()];
        for (int i = 0; i < value.length(); i++) {
            ch[i] = value.charAt(i);
        }

        return ch;

    }

}
