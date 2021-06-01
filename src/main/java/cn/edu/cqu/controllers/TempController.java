package cn.edu.cqu.controllers;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TempController
{
	@RequestMapping(value="/imgNews.json") 
	public HashMap<String, Object> imgNews() throws IOException
	{
		HashMap<String, Object> results = new HashMap<String, Object>();
		Document doc = Jsoup.connect("http://www.cs.cqu.edu.cn/").get();
		Elements link = doc.select("#u_u4_ifocus_piclist").first().select("ul").select("li");
		Elements link2 = doc.select("#u_u4_ifocus_tx_ul").first().select("li");
		LinkedList<String> urlData = new LinkedList<>();
		LinkedList<String> imgData = new LinkedList<>();
		LinkedList<String> titleData = new LinkedList<>();
		for (Element element : link)
		{
			String url = "http://www.cs.cqu.edu.cn/" + element.select("a").attr("href");
			String imgSrc =  "http://www.cs.cqu.edu.cn" +element.select("a").select("img").attr("src");
			urlData.addLast(url);
			imgData.addLast(imgSrc);
		}
		for (Element element : link2)
		{
			String title = element.text();
			titleData.addLast(title);
		}
		results.put("urlData", urlData);
		results.put("imgData", imgData);
		results.put("titleData", titleData);
		results.put("status", 0);
		return results;
	}
	
	@RequestMapping(value="/textNews.json") 
	public HashMap<String, Object> textNews() throws IOException
	{
		HashMap<String, Object> results = new HashMap<String, Object>();
		
		
		Document doc = Jsoup.connect("http://www.cs.cqu.edu.cn/jxgz/yjsjx.htm").get();
		Elements links = doc.select("ul").first().select("li");
		LinkedList<String> urlData = new LinkedList<>();
		LinkedList<String> titleData = new LinkedList<>();
		for (Element element : links)
		{
			String url = "http://www.cs.cqu.edu.cn/" + element.select("a").get(1).attr("href").substring(3);
			String title =  element.select("a").get(1).attr("title");
			urlData.addLast(url);
			titleData.addLast(title);
		}
		results.put("urlData", urlData);
		results.put("titleData", titleData);
		results.put("status", 0);
		return results;
	}
}
