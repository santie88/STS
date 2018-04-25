package com.tutorial.beans;

import org.springframework.beans.factory.annotation.Required;

import com.tutorial.interfaces.ITeam;

public class Player {

		private int number;
		private String name;
		
		private ITeam team;
		
		public int getNumber() {
			return number;
		}
		public void setNumber(int number) {
			this.number = number;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public ITeam getTeam() {
			return team;
		}
		
		@Required
		public void setTeam(ITeam team) {
			this.team = team;
		}
}
