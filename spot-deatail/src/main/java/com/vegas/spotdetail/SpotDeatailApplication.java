package com.vegas.spotdetail;

import java.util.Arrays;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class SpotDeatailApplication {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(SpotDeatailApplication.class, args);
	}

	@PostConstruct
	private void initDb() {
		String sqlStatements[] = {
				"INSERT INTO CLOTH(ID,CD_BODY,CD_HEIGHT,IMG_LINK) VALUES(301,2,2,'https://tshop.r10s.jp/nanaselect/cabinet/op/10004119.jpg?fitin=480:480')",
				"INSERT INTO CLOTH(ID,CD_BODY,CD_HEIGHT,IMG_LINK) VALUES(302,2,2,'https://image.rakuten.co.jp/girl-k/cabinet/item_image/dress3/fu-079_cover_mika_01.jpg')",
				"INSERT INTO CLOTH(ID,CD_BODY,CD_HEIGHT,IMG_LINK) VALUES(303,2,2,'https://image.rakuten.co.jp/girl-k/cabinet/item_image/dress5/to-165-01.jpg')",
				"INSERT INTO CLOTH(ID,CD_BODY,CD_HEIGHT,IMG_LINK) VALUES(304,2,2,'https://image.rakuten.co.jp/classical/cabinet/02978899/05954594/cla803070_02.jpg')",
				"INSERT INTO CLOTH(ID,CD_BODY,CD_HEIGHT,IMG_LINK) VALUES(305,2,2,'https://image.rakuten.co.jp/mobacaba/cabinet/img_m2301-m2400/m2394_i28_750.jpg')",
				"INSERT INTO CLOTH(ID,CD_BODY,CD_HEIGHT,IMG_LINK) VALUES(306,2,2,'https://thumbnail.image.rakuten.co.jp/@0_mall/myu-mie/cabinet/shouhin-gasou/06698911/06698912/imgrc0075127815.jpg')",
				"INSERT INTO CLOTH(ID,CD_BODY,CD_HEIGHT,IMG_LINK) VALUES(307,2,2,'https://image.rakuten.co.jp/classical/cabinet/02978899/06523639/clk-017_05n1.jpg')",
				"INSERT INTO CLOTH(ID,CD_BODY,CD_HEIGHT,IMG_LINK) VALUES(308,2,2,'https://image.rakuten.co.jp/garageshop/cabinet/kw00001--/kw00398-9.jpg')",
				"INSERT INTO CLOTH(ID,CD_BODY,CD_HEIGHT,IMG_LINK) VALUES(309,2,2,'https://image.rakuten.co.jp/retel/cabinet/s/165/30010346_01.jpg')",
				"INSERT INTO CLOTH(ID,CD_BODY,CD_HEIGHT,IMG_LINK) VALUES(310,2,2,'https://image.rakuten.co.jp/ascno5/cabinet/06628036/ff0699_02.jpg')",
				"INSERT INTO CLOTH(ID,CD_BODY,CD_HEIGHT,IMG_LINK) VALUES(311,2,2,'https://image.rakuten.co.jp/ascno5/cabinet/ff/ff2/ff0940_03.jpg')",
				"INSERT INTO CLOTH(ID,CD_BODY,CD_HEIGHT,IMG_LINK) VALUES(312,2,2,'https://image.rakuten.co.jp/ascno5/cabinet/ff/ff2/ff0940_03.jpg')",
				"INSERT INTO CLOTH(ID,CD_BODY,CD_HEIGHT,IMG_LINK) VALUES(313,2,2,'https://image.rakuten.co.jp/ascno5/cabinet/ff/ff2/ff0943_05.jpg')",
				"INSERT INTO CLOTH(ID,CD_BODY,CD_HEIGHT,IMG_LINK) VALUES(314,2,2,'https://image.rakuten.co.jp/natural-lily/cabinet/06707696/ff0706_05.jpg')",
				"INSERT INTO CLOTH(ID,CD_BODY,CD_HEIGHT,IMG_LINK) VALUES(315,2,2,'https://image.rakuten.co.jp/natural-lily/cabinet/tops/ff0609_01.jpg')",
				"INSERT INTO CLOTH(ID,CD_BODY,CD_HEIGHT,IMG_LINK) VALUES(316,2,2,'https://image.rakuten.co.jp/ascno5/cabinet/05769014/ff0035_04.jpg')",
				"INSERT INTO CLOTH(ID,CD_BODY,CD_HEIGHT,IMG_LINK) VALUES(317,2,2,'https://image.rakuten.co.jp/natural-lily/cabinet/main/mainff/ff0708-2.jpg')",
				"INSERT INTO CLOTH(ID,CD_BODY,CD_HEIGHT,IMG_LINK) VALUES(318,2,2,'https://image.rakuten.co.jp/natural-lily/cabinet/tops/ff0694_03.jpg')",
				"INSERT INTO CLOTH(ID,CD_BODY,CD_HEIGHT,IMG_LINK) VALUES(319,2,2,'https://c03.castel.jp/picture?url=https%3A%2F%2Fcastel.jp%2Fimg%2Fup%2Fpicture_21053.JPG&w=669')",
				"INSERT INTO CLOTH(ID,CD_BODY,CD_HEIGHT,IMG_LINK) VALUES(320,2,2,'https://image.rakuten.co.jp/hhh-style/cabinet/80706/z661-6.jpg')",
				"INSERT INTO CLOTH(ID,CD_BODY,CD_HEIGHT,IMG_LINK) VALUES(321,2,2,'https://image.rakuten.co.jp/hhh-style/cabinet/90522/x938-6.jpg')",


				"INSERT INTO CLOTH_SPOT(SPOT_ID, CLOTH_ID) VALUES(101,301)",
				"INSERT INTO CLOTH_SPOT(SPOT_ID, CLOTH_ID) VALUES(101,302)",
				"INSERT INTO CLOTH_SPOT(SPOT_ID, CLOTH_ID) VALUES(101,303)",

				"INSERT INTO CLOTH_SPOT(SPOT_ID, CLOTH_ID) VALUES(102,304)",
				"INSERT INTO CLOTH_SPOT(SPOT_ID, CLOTH_ID) VALUES(102,305)",
				"INSERT INTO CLOTH_SPOT(SPOT_ID, CLOTH_ID) VALUES(102,306)",

				"INSERT INTO CLOTH_SPOT(SPOT_ID, CLOTH_ID) VALUES(103,307)",
				"INSERT INTO CLOTH_SPOT(SPOT_ID, CLOTH_ID) VALUES(103,308)",
				"INSERT INTO CLOTH_SPOT(SPOT_ID, CLOTH_ID) VALUES(103,309)",

				"INSERT INTO CLOTH_SPOT(SPOT_ID, CLOTH_ID) VALUES(104,310)",
				"INSERT INTO CLOTH_SPOT(SPOT_ID, CLOTH_ID) VALUES(104,311)",
				"INSERT INTO CLOTH_SPOT(SPOT_ID, CLOTH_ID) VALUES(104,312)",

				"INSERT INTO CLOTH_SPOT(SPOT_ID, CLOTH_ID) VALUES(105,313)",
				"INSERT INTO CLOTH_SPOT(SPOT_ID, CLOTH_ID) VALUES(105,314)",
				"INSERT INTO CLOTH_SPOT(SPOT_ID, CLOTH_ID) VALUES(105,315)",

				"INSERT INTO CLOTH_SPOT(SPOT_ID, CLOTH_ID) VALUES(106,316)",
				"INSERT INTO CLOTH_SPOT(SPOT_ID, CLOTH_ID) VALUES(106,317)",
				"INSERT INTO CLOTH_SPOT(SPOT_ID, CLOTH_ID) VALUES(106,318)",

				"INSERT INTO CLOTH_SPOT(SPOT_ID, CLOTH_ID) VALUES(107,319)",
				"INSERT INTO CLOTH_SPOT(SPOT_ID, CLOTH_ID) VALUES(108,319)",
				"INSERT INTO CLOTH_SPOT(SPOT_ID, CLOTH_ID) VALUES(109,320)",
				"INSERT INTO CLOTH_SPOT(SPOT_ID, CLOTH_ID) VALUES(109,321)"


		};

		Arrays.asList(sqlStatements).forEach(sql -> {
			jdbcTemplate.execute(sql);
		});

		// Fetch data using SELECT statement and print results
	}

}
