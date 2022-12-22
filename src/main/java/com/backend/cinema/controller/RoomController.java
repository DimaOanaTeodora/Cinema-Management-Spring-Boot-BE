package com.backend.cinema.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.cinema.service.RoomService;

@RestController
@RequestMapping("/room")
public class RoomController {
private final RoomService roomService;
	
	public RoomController(RoomService roomService) {
		this.roomService = roomService;
	}
}