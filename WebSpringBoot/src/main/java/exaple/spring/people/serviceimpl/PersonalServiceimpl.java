package exaple.spring.people.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import exaple.spring.people.entity.Personal;
import exaple.spring.people.model.PersonalDTO;
import exaple.spring.people.repository.PersonalRepository;
import exaple.spring.people.service.PersonalService;
@Service
@Transactional
public class PersonalServiceimpl implements PersonalService{
	@Autowired
	private PersonalRepository personalRepository;
	/**
	 * Create by: nmanh - CMC
	 * Create date: Jan 15, 2019
	 * Modifier: nmanh
	 * Modified date: Jan 15, 2019
	 * Description: return object
	 * Version 1.0
	 * @return
	 */
	@Override
	public List<PersonalDTO> getAllPersonal() {
		List<Personal> personal = personalRepository.getAllPersona();
		
		List<PersonalDTO> dtos= new ArrayList<PersonalDTO>();
		for(Personal u : personal) {
			PersonalDTO personalDTO = new PersonalDTO();
			personalDTO.setPersonalId(u.getPersonalId());
			personalDTO.setFirstName(u.getFirstName());
			personalDTO.setLastName(u.getLastName());
			personalDTO.setMobile(u.getMobile());
			personalDTO.setEmail(u.getEmail());
			personalDTO.setHobbies(u.getHobbies());
			personalDTO.setDesciption(u.getDesciption());
			dtos.add(personalDTO);
		}
		return dtos;
	}

	/**
	 * Create by: nmanh - CMC
	 * Create date: Jan 15, 2019
	 * Modifier: nmanh
	 * Modified date: Jan 15, 2019
	 * Description: add Personal
	 * Version 1.0
	 * @param personalDTO
	 */
	@Override
	public void addPersonal(PersonalDTO personalDTO) {
		Personal u = new Personal();
		u.setPersonalId(personalDTO.getPersonalId());
		u.setFirstName(personalDTO.getFirstName());
		u.setLastName(personalDTO.getLastName());
		u.setMobile(personalDTO.getMobile());
		u.setEmail(personalDTO.getEmail());
		u.setHobbies(personalDTO.getHobbies());
		u.setDesciption(personalDTO.getDesciption());
		personalRepository.addPersonal(u);
		
	}

	/**
	 * Create by: nmanh - CMC
	 * Create date: Jan 15, 2019
	 * Modifier: nmanh
	 * Modified date: Jan 15, 2019
	 * Description: delete Personal
	 * Version 1.0
	 * @param id
	 */
	@Override
	public void deletePersonal(int id) {
		Personal personal = personalRepository.getAllPersonal(id);
		if(personal != null) {
			personalRepository.deletePersonal(personal);
		}
	}

	/**
	 * Create by: nmanh - CMC
	 * Create date: Jan 15, 2019
	 * Modifier: nmanh
	 * Modified date: Jan 15, 2019
	 * Description: update Personal
	 * Version 1.0
	 * @param personalDTO
	 */
	@Override
	public void updatePersonal(PersonalDTO personalDTOO) {
		Personal personal = personalRepository.getAllPersonal(personalDTOO.getPersonalId());
		if(personal != null) {
			personal.setFirstName(personalDTOO.getFirstName());
			personal.setLastName(personalDTOO.getLastName());
			personal.setMobile(personalDTOO.getMobile());
			personal.setEmail(personalDTOO.getEmail());
			personal.setHobbies(personalDTOO.getHobbies());
			personal.setDesciption(personalDTOO.getDesciption());
			personalRepository.updatePersonal(personal);;
		}
		
	}

	/**
	 * Create by: nmanh - CMC
	 * Create date: Jan 15, 2019
	 * Modifier: nmanh
	 * Modified date: Jan 15, 2019
	 * Description: add all Personal
	 * Version 1.0
	 * @param id
	 * @return
	 */
	@Override
	public PersonalDTO getAllPersonal(int id) {
		Personal u =personalRepository.getAllPersonal(id);
		PersonalDTO personalDTO = new PersonalDTO();
		personalDTO.setPersonalId(u.getPersonalId());
		personalDTO.setFirstName(u.getFirstName());
		personalDTO.setLastName(u.getLastName());
		personalDTO.setMobile(u.getMobile());
		personalDTO.setEmail(u.getEmail());
		personalDTO.setHobbies(u.getHobbies());
		personalDTO.setDesciption(u.getDesciption());
		return personalDTO;
	}

}
