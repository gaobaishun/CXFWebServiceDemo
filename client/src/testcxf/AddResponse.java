
package testcxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *
 *
 *
 *
 * <pre>
 * &lt;complexType name="addResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addResponse", propOrder = {
    "_return"
})
public class AddResponse {

    @XmlElement(name = "return")
    protected int _return;

    /**
     * ��ȡreturn���Ե�ֵ��
     *
     */
    public int getReturn() {
        return _return;
    }

    /**
     * ����return���Ե�ֵ��
     *
     */
    public void setReturn(int value) {
        this._return = value;
    }

}
