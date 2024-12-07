package com.kosmos.test.dto.output;

import com.kosmos.test.entity.ConsultingRoom;

public class ConsultingRoomDto {

    private Integer position;
    private String floor;

    public ConsultingRoom toConsultingRoom(){
        return new ConsultingRoom(this.position,this.floor);
    }
}
