package phonebook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller

public class Controller {
   @Autowired
   ContactDao dao;
   
   @RequestMapping("/add_contacts")
   public ModelAndView addContact() {
	   ModelAndView mav = new ModelAndView("Add_Contact.jsp");
	   Contact c=new Contact();
	   mav.addObject("Contact",c);
	   return mav;
   }
   
   @RequestMapping("/saveContact")
   public ModelAndView saveContact(@ModelAttribute Contact c) {
	   ModelAndView mav = new ModelAndView("HomePage.jsp");
	   dao.saveContact(c);
	   return mav;
   }
   
   @RequestMapping("/mycontacts")
   public ModelAndView myContacts() {
	   ModelAndView mav = new ModelAndView("ViewAll.jsp");
	   List<Contact> contact=dao.getAllContacts();
	   mav.addObject("allcontacts", contact);
	   return mav;
   }
   
   @RequestMapping("/update")
   public ModelAndView update (@RequestParam int id) {
	   ModelAndView mav =  new ModelAndView("update.jsp");
	   Contact c = dao.update(id);
	   mav.addObject("id", c);
	   return mav ;
	   
   }
   
   @RequestMapping("/updated")
   public ModelAndView updated(@ModelAttribute Contact c) {
	   ModelAndView mav = new ModelAndView("HomePage.jsp");
	   dao.updateUser(c);
	   return mav ;
   }
   
   @RequestMapping("/delete")
   public ModelAndView delete(@RequestParam int id) {
	   ModelAndView mav =new ModelAndView("HomePage.jsp");
		dao.deleteUser(id);
		return mav;
   }
}
