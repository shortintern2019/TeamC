package com.vegas.spotapi;

import java.util.Arrays;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class SpotApiApplication {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(SpotApiApplication.class, args);
	}

	@PostConstruct
	private void initDb() {
		String sqlStatements[] = {
				"ALTER TABLE SPOT MODIFY D_DESCRIPTION VARCHAR(2000)",
				"INSERT INTO SPOT(ID_SEQ,NAME,LATITUDE,LONGITUDE,CD_TYPE,D_DESCRIPTION,URL) VALUES(101,'The 30th Restaurant',35.610552, 139.630067,1,'親しいご友人や職場のお仲間と楽しい時間を共有できるダイニング。選りすぐりの食材を用いたこだわりのお料理を素晴らしい景色と共にお楽しみください。職場やサークルの懇親会といった賑やかなお集まりの場としてご活用ください。', 'https://www.tokyuhotels.co.jp/futako-e/restaurant/dining/index.html')",
				"INSERT INTO SPOT(ID_SEQ,NAME,LATITUDE,LONGITUDE,CD_TYPE,D_DESCRIPTION,URL) VALUES(102,'Bubby`s Futakotamagawa',35.610976,139.630944,1,'Located at the Terrace Market 2nd floor of Futakotamagawa Rise. Why don’t you visit us after a busy day shopping or on the way back from the cinema? Our takeout counter makes it easy for you to take our delicious homemade pies and drinks home.','https://bubbys.jp/locations/futakotamagawa/')",
				"INSERT INTO SPOT(ID_SEQ,NAME,LATITUDE,LONGITUDE,CD_TYPE,D_DESCRIPTION,URL) VALUES(103,'100本のスプーン 二子玉川',35.610835,139.631119,1,'コドモがオトナに憧れて、オトナがコドモゴコロを思い出す','https://100spoons.com')",
				"INSERT INTO SPOT(ID_SEQ,NAME,LATITUDE,LONGITUDE,CD_TYPE,D_DESCRIPTION,URL) VALUES(104,'Minatomirai',35.46008,139.632458,7,'Minatomirai is a futuristic waterfront with a high-rise observation deck and stylish boutiques at Yokohama Landmark Tower and Plaza. Families also take in the skyline from the Cosmo Clock 21 Ferris wheel or tour the 1930s sailing ship Nippon Maru. Mitsubishi Industrial Museum has dynamic exhibits of rockets and submarines, while Rinko Park hosts summer concerts. Waterside promenades host upscale bars and eateries.','http://minatomirai21.com/')",
				"INSERT INTO SPOT(ID_SEQ,NAME,LATITUDE,LONGITUDE,CD_TYPE,D_DESCRIPTION,URL) VALUES(105,'Yokohama Red Brick Warehouse',35.452679,139.643105,7,'Former brick warehouse, now a shopping & cultural center with stores, cafes & seasonal events.','https://www.yokohama-akarenga.jp')",
				"INSERT INTO SPOT(ID_SEQ,NAME,LATITUDE,LONGITUDE,CD_TYPE,D_DESCRIPTION,URL) VALUES(106,'Yokohama Landmark Tower',35.454954,139.631386,7,'This huge tower with a hotel, mall & offices also has an observation area with 360-degree views.','https://www.yokohama-landmark.jp')",
				"INSERT INTO SPOT(ID_SEQ,NAME,LATITUDE,LONGITUDE,CD_TYPE,D_DESCRIPTION,URL) VALUES(107,'Tokyo Disneyland',35.632896,139.880394,4,'Tokyo offshoot of the iconic theme park known for its rides, live shows & costumed characters.','https://www.tokyodisneyresort.jp/tdl/')",
				"INSERT INTO SPOT(ID_SEQ,NAME,LATITUDE,LONGITUDE,CD_TYPE,D_DESCRIPTION,URL) VALUES(108,'Tokyo DisneySea',35.626711,139.885078,4,'Part of the Disney resort, this large park has 7 themed ports of call with rides, shows & dining.','https://www.tokyodisneyresort.jp/tds/')",
				"INSERT INTO SPOT(ID_SEQ,NAME,LATITUDE,LONGITUDE,CD_TYPE,D_DESCRIPTION,URL) VALUES(109,'Tokyo Sea Life Park',35.640094,139.862165,4,'Airy aquarium featuring marine life from around the globe, including sharks, eagle rays & penguins.','https://www.tokyo-zoo.net/zoo/kasai/')",
				//INSERT INTO MEDIA
				"INSERT INTO MEDIA(ID,SPOT_ID,IMG_LINK) VALUES(201,101,'https://www.tokyuhotels.co.jp/futako-e/restaurant/dining/images/restaurant_dining_images_02.jpg')",
				"INSERT INTO MEDIA(ID,SPOT_ID,IMG_LINK) VALUES(202,102,'https://bubbys.jp/wp-content/uploads/2017/04/futa-top.jpg')",
				"INSERT INTO MEDIA(ID,SPOT_ID,IMG_LINK) VALUES(203,103,'https://100spoons.com/wp-content/themes/100spoons/img/fk/menu-point-1.jpg')",
				"INSERT INTO MEDIA(ID,SPOT_ID,IMG_LINK) VALUES(204,104,'https://cdn.jalan.jp/jalan/img/2/kuchikomi/0552/KXL/33640_0000552642_1.JPG')",
				"INSERT INTO MEDIA(ID,SPOT_ID,IMG_LINK) VALUES(205,105,'https://cdn.jalan.jp/jalan/img/0/kuchikomi/0470/KXL/219b5_0000470967_1.jpg')",
				"INSERT INTO MEDIA(ID,SPOT_ID,IMG_LINK) VALUES(206,106,'https://cdn.jalan.jp/jalan/img/9/kuchikomi/0689/KXL/d33c6_0000689469_1.jpg')",
				"INSERT INTO MEDIA(ID,SPOT_ID,IMG_LINK) VALUES(207,107,'https://media2.tokyodisneyresort.jp/home/tdl/top/mainL_20190401_01.jpg')",
				"INSERT INTO MEDIA(ID,SPOT_ID,IMG_LINK) VALUES(208,108,'https://media2.tokyodisneyresort.jp/home/tds/top/mainS_2019_03.jpg')",
				"INSERT INTO MEDIA(ID,SPOT_ID,IMG_LINK) VALUES(209,109,'https://www.tokyo-zoo.net/zoo/kasai/img/slideshow/03_aqua_theater.jpg')"

		};

		Arrays.asList(sqlStatements).forEach(sql -> {
			jdbcTemplate.execute(sql);
		});

		// Fetch data using SELECT statement and print results
	}

}
