package exaple.spring.people.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import exaple.spring.people.entity.Menu;
import exaple.spring.people.entity.User;
import exaple.spring.people.model.MenuDTO;
import exaple.spring.people.model.UserDTO;
import exaple.spring.people.repository.MenuRepository;
import exaple.spring.people.service.MenuService;
@Service
@Transactional
public class MenuServiceimpl implements MenuService{
	@Autowired
	private MenuRepository menuRepository;
	/**
	 * Create by: nmanh - CMC
	 * Create date: Jan 16, 2019
	 * Modifier: nmanh
	 * Modified date: Jan 16, 2019
	 * Description: ....
	 * Version 1.0
	 * @return
	 */
	@Override
	public List<MenuDTO> getAllMenu() {
		List<Menu> menu = menuRepository.getALLMenus();
		
		List<MenuDTO> dtos= new ArrayList<MenuDTO>();
		for(Menu u : menu) {
			MenuDTO menuDTO = new MenuDTO();
			menuDTO.setMenuId(u.getMenuId());
			menuDTO.setName(u.getName());
			menuDTO.setDesc(u.getDesc());
			menuDTO.setController(u.getController());
			menuDTO.setFunction(u.getFunction());
			dtos.add(menuDTO);
		}
		return dtos;
	}

	/**
	 * Create by: nmanh - CMC
	 * Create date: Jan 16, 2019
	 * Modifier: nmanh
	 * Modified date: Jan 16, 2019
	 * Description: ....
	 * Version 1.0
	 * @param menuDTO
	 */
	@Override
	public void addMenu(MenuDTO menuDTO) {
		Menu u = new Menu();
		u.setName(menuDTO.getName());
		u.setDesc(menuDTO.getDesc());
		u.setController(menuDTO.getController());
		u.setFunction(menuDTO.getFunction());
		menuRepository.addMenu(u);
		
	}

	/**
	 * Create by: nmanh - CMC
	 * Create date: Jan 16, 2019
	 * Modifier: nmanh
	 * Modified date: Jan 16, 2019
	 * Description: ....
	 * Version 1.0
	 * @param id
	 */
	@Override
	public void deleteMenu(int id) {
		Menu menu = menuRepository.getAllMenu(id);
		if(menu != null) {
			menuRepository.deleteMenu(menu);;
		}
	}

	/**
	 * Create by: nmanh - CMC
	 * Create date: Jan 16, 2019
	 * Modifier: nmanh
	 * Modified date: Jan 16, 2019
	 * Description: ....
	 * Version 1.0
	 * @param menuDTOO
	 */
	@Override
	public void updateMenu(MenuDTO menuDTOO) {
		Menu menu = menuRepository.getAllMenu(menuDTOO.getMenuId());
		if(menu != null) {
			menu.setName(menuDTOO.getName());
			menu.setDesc(menuDTOO.getDesc());
			menu.setController(menuDTOO.getController());
			menu.setFunction(menuDTOO.getFunction());
			menuRepository.updateMenu(menu);;
		}
	}

	/**
	 * Create by: nmanh - CMC
	 * Create date: Jan 16, 2019
	 * Modifier: nmanh
	 * Modified date: Jan 16, 2019
	 * Description: ....
	 * Version 1.0
	 * @param id
	 * @return
	 */
	@Override
	public MenuDTO getAllMenu(int id) {
		Menu u =menuRepository.getAllMenu(id);
		MenuDTO menuDTO = new MenuDTO();
		menuDTO.setMenuId(u.getMenuId());
		menuDTO.setName(u.getName());
		menuDTO.setDesc(u.getDesc());
		menuDTO.setController(u.getController());
		menuDTO.setFunction(u.getFunction());
		return menuDTO;
	}

}
