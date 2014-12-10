package mawaid.service;

import java.util.ArrayList;
import java.util.List;

import mawaid.json.RsvpWeek;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Service
@RequestMapping("/rsvp")
public class RsvpService {

	@ResponseBody
	@RequestMapping(value="/mine", method=RequestMethod.GET, produces="application/json")
	public List<RsvpWeek> getRsvp() {
		List<RsvpWeek> result = new ArrayList<RsvpWeek>();
		//result.setWindows(windowRepo.findAll());
		result.add(new RsvpWeek(1L, "Week 1: Dec 01 - Dec 07", null));
		result.add(new RsvpWeek(1L, "Week 2: Dec 08 - Dec 14", null));
		result.add(new RsvpWeek(1L, "Week 3: Dec 01 - Dec 07", null));
		result.add(new RsvpWeek(1L, "Week 4: Dec 01 - Dec 07", null));
		
		return result;
	}
}
