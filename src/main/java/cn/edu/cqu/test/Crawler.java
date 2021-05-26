package cn.edu.cqu.test;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Crawler
{
	public static void main(String[] args) throws IOException
	{
		Document doc = Jsoup.connect("http://www.cs.cqu.edu.cn/").get();
		Elements links = doc.select("#u_u4_ifocus_piclist").first().select("ul").select("li");
		//System.out.println(links.html());
		//System.out.println("");
		for (Element element : links)
		{
			String url = "http://www.cs.cqu.edu.cn/" + element.select("a").attr("href");
			String imgSrc =  "http://www.cs.cqu.edu.cn" +element.select("a").select("img").attr("src");
			System.out.println(imgSrc+ url);
		}
	}
}
