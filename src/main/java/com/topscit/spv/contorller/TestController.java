package com.topscit.spv.contorller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.topscit.spv.bean.TestBean;


@Controller
@RequestMapping("/test")
public class TestController {
	
	 public String test(){
		return null;
		
	}
	
	/*@RequestMapping("/t")
	public ModelAndView test(String uname)
	{
		System.out.println("����"+uname);
		
		
		ModelAndView mv = new ModelAndView();
	//	mv.setViewName("test/a");//������ת��
		
		//ת�����ض��򵽰�ȫĿ¼����		
		mv.setViewName("test");
//		mv.setViewName("redirect:/test.jsp");
		
		mv.addObject("msg", "11");
		return mv;
	}
	
	//�ض��򵽵�ǰ�������ķ�����·������д��
	@RequestMapping("/t1")
	public ModelAndView test1()
	{
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("redirect:/test/t2"); //redirect:t2
		mv.addObject("tdata", "11");
		
		return mv;
	}
	
	@RequestMapping("t2")
	public ModelAndView test2(String tdata)
	{
		System.out.println("�ض��������");
		System.out.println(tdata);
		return null;
	}
	
	//�ض�������������
	@RequestMapping("/t3")
	public ModelAndView test3()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("redirect:/second/t1"); 
		mv.addObject("tdata", "11");
		
		return mv;
	}
	
	//�����Զ�ת������
	@RequestMapping("/t4")
	public ModelAndView test4(String uname,Integer b,String c)
	{
		System.out.println(uname);
		System.out.println(b);
		System.out.println(c);
		
		return null;
	}

	
	//����ֱ���Զ���װ��javabean
	@RequestMapping("/t5")
	public ModelAndView test5(TestBean testBean,String uname)
	{
		System.out.println(uname);
		System.out.println(testBean.getUname());
		
		return null;
	}

	
	//��ȡrequest����
	@RequestMapping("/t6")
	public ModelAndView test6(HttpServletRequest req)
	{
		String contextPath = req.getContextPath();
		System.out.println(contextPath);
		return null;
	}
	
	//��ModelAndView��д��
	@RequestMapping("/t7")
	public String test7(String name,Map<String, Object> data)
	{
		data.put("tdata", "11");
		return "forward:/test.jsp";
	}
	
	
	//�������������
	@RequestMapping(name="/t8",method=RequestMethod.GET)
	public String test8()
	{
		return "";
	}
	
	
	*/
	
	
}



