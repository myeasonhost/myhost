package com.eason.api.zb;

import com.eason.api.zb.cache.ZbTUserPersonal;
import com.eason.api.zb.cache.ZbTUserTicket;
import com.eason.api.zb.dao.RoomDao;
import com.eason.api.zb.dao.UserPersonalDao;
import com.eason.api.zb.dao.UserTicketDao;
import com.eason.api.zb.model.SequenceId;
import com.eason.api.zb.model.ZbConstant;
import com.eason.api.zb.po.ZbTRoom;
import com.eason.api.zb.service.impl.ZhuboServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.FileCopyUtils;

import javax.annotation.Resource;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Timestamp;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RoomTests {
	@Autowired
	private RoomDao roomDao;
	@Autowired
	private UserTicketDao userTicketDao;
	@Autowired
	private UserPersonalDao userPersonalDao;
	@Autowired
	private ZhuboServiceImpl zhuboServiceImpl;
	@Resource
	private MongoTemplate mongoTemplate;
	@Test
	public void addRoom() {
		ZbTRoom room=new ZbTRoom();
		room.setZbId(1);
		room.setRoomTitle("提莫的直播间");
		room.setRoomInfo("可爱的美女的直播间····");
		room.setRoomBgPic("http://ZbTRoom.png");
		room.setRoomStatus(ZbConstant.Room.status.room_ing);
		room.setIsVideo(ZbConstant.Room.video.enable);
		room.setOrderField(1);
		room.setCreate_Time(new Timestamp(System.currentTimeMillis()));
		roomDao.save(room);
	}

	@Test
	public void findRoom() {
		ZbTUserTicket ticket=userTicketDao.findByPlanIdAndUserId(1,1);
		System.out.println(ticket);
	}

	@Test
	public void uploadRoomBG() throws Exception{
		ZbTRoom zbTRoom=roomDao.findByZbUserId(6451);
		System.out.println(zbTRoom.getRoomWatermark());
	}

	@Test
	public void addUserPersonal() {
		for (int i=0;i<10;i++){
			ZbTUserPersonal zbTUserPersonal=new ZbTUserPersonal();
			zbTUserPersonal.setZbId(1+i);
			zbTUserPersonal.setUserId(1+i);
			zbTUserPersonal.setActivityTime(120);
			zbTUserPersonal.setStartTime(new Date());
			zbTUserPersonal.setInviteTime(new Date());

			userPersonalDao.save(zbTUserPersonal);
		}

	}

}
