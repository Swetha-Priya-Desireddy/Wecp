import { Component, OnInit } from '@angular/core';
import { IplService } from '../../services/ipl.service';
import { Team } from '../../types/Team';
import { Cricketer } from '../../types/Cricketer';
import { Match } from '../../types/Match';
import { TicketBooking } from '../../types/TicketBooking';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Vote } from '../../types/Vote';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.scss']
})
export class DashboardComponent implements OnInit {
  teams: Team[] = [];
  cricketers: Cricketer[] = [];
  matches: Match[] = [];
  ticketsBooked: TicketBooking[] = [];
  voteList: Vote[];
  emailForm: FormGroup;
  role: string| null;
  userId: number; 

  constructor(private iplService: IplService, private fb: FormBuilder) {}

  ngOnInit(): void {
    this.role = localStorage.getItem("role");
    this.userId = Number(localStorage.getItem("user_id"));
    this.emailForm = this.fb.group({
      email: ['', [Validators.required, Validators.email]]
    });
    this.loadTeams();
    this.loadCricketers();
    this.loadMatches();
    this.loadVotes();
  }

  loadTeams(): void {
    this.iplService.getAllTeams().subscribe((teams) => {
      this.teams = teams;
    });
  }

  loadCricketers(): void {
    this.iplService.getAllCricketers().subscribe((cricketers) => {
      this.cricketers = cricketers;
    });
  }

  loadMatches(): void {
    this.iplService.getAllMatches().subscribe((matches) => {
      this.matches = matches;
    });
  }

  loadVotes(): void {
    this.iplService.getAllVotes().subscribe((votes) => {
      this.voteList = votes;
    });
  }

  loadTicketsBooked(): void {
    const email = this.emailForm.get('email')?.value;
    this.iplService.getBookingsByUserEmail(email).subscribe((ticketsBooked) => {
      this.ticketsBooked = ticketsBooked;
    });
  }

  onSubmitEmail(): void {
    if (this.emailForm.valid) {
      this.loadTicketsBooked();
    }
  }
}
