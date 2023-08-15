/**********************************************************************/
/* Author: Sumanish <sumanish.cse.jgec@gmail.com>                     */
/* Modified By: Sumanish <sumanish.cse.jgec@gmail.com>                */
/*                                                                    */  
/* This source code can be downloaded, use, modify, distribute        */
/* freely with this headed intact. Please don't delete this header.   */
/**********************************************************************/ 

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class EdifTokens {
    public static final int ID_INT_CONSTANT = 1000;
    public static final int ID_DOUBLE_CONSTANT;
    public static final int ID_DOUBLE_EXP_CONSTANT;
    // Vivado type token ids
    public static final int ID_EDIF_VERSION_X;      
    public static final int ID_EDIF_LEVEL_X;        
    public static final int ID_KEYWORD_MAP_X;       
    public static final int ID_KEYWORD_LEVEL_X;     
    public static final int ID_TIME_STAMP_X;        
    public static final int ID_DATA_ORIGIN_X;       
    public static final int ID_NUMBER_DEFINITION_X; 
    public static final int ID_CELLTYPE_X;          
    public static final int ID_VIEWTYPE_X;          
    public static final int ID_VIEWREF_X;           
    public static final int ID_CELLREF_X;           
    public static final int ID_LIBRARYREF_X;        
    public static final int ID_PORTREF_X;           
    public static final int ID_INSTANCEREF_X;       
    public static final int ID_LIBRARY_X;

    String identifier = "[a-zA-Z_&][a-zA-Z_0-9\\\.\\\-\\\[\\\]$]*";
    String string_constant = "[\\\"][a-zA-Z0-9_\\\.\\\-\\\[\\\]$ :'\\\<\\\>\\\{\\\}\\\*=\\\/\\\\,()]*[\\\"]";
    String int_constant = "[0-9\\\-][0-9]*";
    String double_constant = "[0-9]+\\\.[0-9]+";
    String double_exp_constant = "[0-9]+e-[0-9]+";
    String edif_ = "edif";
    String edif_version_ = "edifVersion";
    String edif_level_ = "edifLevel";
    String keyword_map_ = "keywordMap";
    String keyword_level_ = "keywordLevel";
    String time_stamp_ = "timeStamp";
    String data_origin_ = "dataOrigin";
    String numberDefinition_ = "numberDefinition";
    String cellType_ = "cellType";
    String viewType_ = "viewType";
    String viewRef_ = "viewRef";
    String cellRef_ = "cellRef";
    String libraryRef_ = "libraryRef";
    String portRef_ = "portRef";
    String instanceRef_ = "instanceRef";
    String status_ = "status";
    String written_ = "written";
    String program_ = "program";
    String prog_version_ = "version";
    String author_ = "author";
    String external_ = "external";
    String technology_ = "technology";
    String cell_ = "cell";
    String view_ = "view";
    String interface_ = "interface";
    String port_ = "port";
    String direction_ = "direction";
    String integer_ = "integer";
    String string_ = "string";
    String property_ = "property";
    String contents_ = "contents";
    String instance_ = "instance";
    String net_ = "net";
    String joined_ = "joined";
    String library_ = "library";
    String design_ = "design";
    String owner_ = "owner";
    String rename_ = "rename";
    String scale_ = "scale";
    String unit_ = "unit";
    String comment_ = "comment";
    String array_ = "array";
    String boolean_ = "boolean";
    String member_ = "member";
    String edif_version_x_ = "edifversion";
    String edif_level_x_ = "ediflevel";
    String keyword_map_x_ = "keywordmap";
    String keyword_level_x_ = "keywordlevel";
    String time_stamp_x_ = "timestamp";
    String data_origin_x_ = "dataorigin";
    String numberDefinition_x_ = "numberdefinition";
    String cellType_x_ = "celltype";
    String viewType_x_ = "viewtype";
    String viewRef_x_ = "viewref";
    String cellRef_x_ = "cellref";
    String libraryRef_x_ = "libraryref";
    String portRef_x_ = "portref";
    String instanceRef_x_ = "instanceref";
    String library_x_ = "Library";

    public static Matcher getIdentifierMatcher(String input) {
        return identifierPattern.matcher(input);
    }

    public static Matcher getStringConstantMatcher(String input) {
        return stringConstantPattern.matcher(input);
    }

    public static Matcher getIntConstantMatcher(String input) {
        return intConstantPattern.matcher(input);
    }

    public static Matcher getDoubleConstantMatcher(String input) {
        return doubleConstantPattern.matcher(input);
    }

    public static Matcher getDoubleExpConstantMatcher(String input) {
        return doubleExpConstantPattern.matcher(input);
    }

    public static Matcher getWhiteSpaceMatcher(String input) {
        return whiteSpacePattern.matcher(input);
    }
}