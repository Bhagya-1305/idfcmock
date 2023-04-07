package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import dao.StudentDao;
import dto.StudentDto;

@Controller
public class StudentController {
	@Autowired
	StudentDto dto;
	
	@Autowired
	StudentDao dao;
	
	@RequestMapping("/create")
	public ModelAndView insert()
	{
		ModelAndView view=new ModelAndView("insert.jsp");
		view.addObject("stdoject", dto);
		return view;
	}
	
	@ResponseBody
	@RequestMapping("/insert")
	public void save(StudentDto std)
	{
		dao.insert(std);
	}
	
	@RequestMapping("/delete")
	public ModelAndView delete()
	{
		ModelAndView  view=new ModelAndView("delete.jsp");
		view.addObject("deletebyid", dto);
		return view;
	}
	
	@ResponseBody
	@RequestMapping("/deleteEmail")
	public String deleteperson(StudentDto std)
	{
		StudentDto dto1=dao.findbyId(std.getId());
		dao.deleteData(dto1);
		return "data deleted successfully" +dto1.getId();
	}
	
	@RequestMapping("/update")
	public ModelAndView update()
	{
		ModelAndView view=new ModelAndView("update.jsp");
		view.addObject("updatebyid", dto);
		return view;
	}
	
	@ResponseBody
	@RequestMapping("/updatedetails")
	public String updateperson(StudentDto dto)
	{
		dao.updateData(dto);
		return "data updated" +dto.getId();
	}
	
	@RequestMapping("/fetch")
	public ModelAndView fetch()
	{
		ModelAndView view=new ModelAndView("fetch.jsp");
		view.addObject("fetchbyid", dto);
		return view;
	}
	
	@ResponseBody
	@RequestMapping("/display")
	public ModelAndView fetchdetails(StudentDto dto)
	{
		int id=dto.getId();
		StudentDto std=dao.fetchData(id);
		ModelAndView view=new ModelAndView("display.jsp");
		view.addObject("key", std);
		return view;
	}
	
	@ResponseBody
	@RequestMapping("/displayall")
	public ModelAndView displayAll()
	{
		List<StudentDto> details=dao.fetchAll();
		ModelAndView view=new ModelAndView("fetchAll.jsp");
		view.addObject("key", details);
		return view;
	}
}
