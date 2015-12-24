package demo.process;

import java.util.Date;
/**
 * 封装最终的xml格式结果
 * @author pamchen-1
 *
 */
public class PictureXmlProcess {
	/**
	 * 封装文字类的返回消息
	 * @param to
	 * @param from
	 * @param content
	 * @return
	 */
	public String picXmlAnswer(String to, String from,
			String id) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		Date date = new Date();
		sb.append("<xml><ToUserName><![CDATA[");
		sb.append(to);
		sb.append("]]></ToUserName><FromUserName><![CDATA[");
		sb.append(from);
		sb.append("]]></FromUserName><CreateTime>");
		sb.append(date.getTime());
		sb.append("</CreateTime><MsgType><![CDATA[image]]></MsgType><Image><MediaId><![CDATA[");
		sb.append(id);
		sb.append("]]></MediaId></Image><FuncFlag>0</FuncFlag></xml>");
		return sb.toString();
	}

}
