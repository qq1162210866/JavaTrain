package network_train;

/**
 * MeteorologicalUnit.java
 * Description:  气象单元
 *
 * @author Peng Shiquan
 * @date 2020/6/17
 */
public class MeteorologicalUnit {

    private String ElementCode;
    private String ElementName;
    private String ElementValue;
    private String ElementUnit;

    public String getElementCode() {
        return ElementCode;
    }

    public void setElementCode(String elementCode) {
        ElementCode = elementCode;
    }

    public String getElementName() {
        return ElementName;
    }

    public void setElementName(String elementName) {
        ElementName = elementName;
    }

    public String getElementValue() {
        return ElementValue;
    }

    public void setElementValue(String elementValue) {
        ElementValue = elementValue;
    }

    public String getElementUnit() {
        return ElementUnit;
    }

    public void setElementUnit(String elementUnit) {
        ElementUnit = elementUnit;
    }

    @Override
    public String toString() {
        return "MeteorologicalUnit{" +
                "ElementCode='" + ElementCode + '\'' +
                ", ElementName='" + ElementName + '\'' +
                ", ElementValue='" + ElementValue + '\'' +
                ", ElementUnit='" + ElementUnit + '\'' +
                '}';
    }
}
