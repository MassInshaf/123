package enumeration;
/** *****************************************************************************
 *  Name:    Inshaf Naleem
 *  UOW ID:   W1902033
 *  IIT ID: 20212172
 *
 *  Description:  node types details can be found here
 *
 *  Written:       20-03-2024
 *  Last updated:  23-04-2024
 *
 **************************************************************************** */
public enum NodeTypes {
    SNOW("*",false),
    ROCK("0", true),
    START("S", false),
    FINISH("F", false),
        ;

    private final String code;
    private final boolean isBlock;

    NodeTypes(String code, boolean isBlock) {
        this.code = code;
        this.isBlock = isBlock;
    }

    public String getCode() {
        return code;
    }

    public boolean isBlock() {
        return isBlock;
    }

    public static NodeTypes getValue(final String code) {
        NodeTypes value = null;
        for (NodeTypes i : NodeTypes.values()) {
            if (i.getCode().contentEquals(code)) {
                value = i;
                break;
            }
        }
        return value;
    }
}
