import { Team } from './Team';

export class Match {
    matchId: number;
    // firstTeam: Team; // ManyToOne relationship with Team
    // secondTeam: Team; // ManyToOne relationship with Team
    firstTeamId:number;
    secondTeamId:number;
    matchDate: Date;
    venue: string;
    result: string;
    status: string;
    // winnerTeam: Team; // ManyToOne relationship with Team
    winnerTeamId:number

    constructor(
        matchId: number,
        // firstTeam: Team,
        // secondTeam: Team,
        firstTeamId:number,
        secondTeamId:number,
        matchDate: Date,
        venue: string,
        result: string,
        status: string,
        // winnerTeam: Team
        winnerTeamId:number

    ) {
        this.matchId = matchId;
        this.firstTeamId = firstTeamId;
        this.secondTeamId = secondTeamId;
        this.matchDate = matchDate;
        this.venue = venue;
        this.result = result;
        this.status = status;
        this.winnerTeamId = winnerTeamId;
    }

    displayInfo() {
        console.log(`Match ID: ${this.matchId}`);
        // console.log(`First Team: ${this.firstTeam.teamName}`);
        // console.log(`Second Team: ${this.secondTeam.teamName}`);
        // console.log(`Winner: ${this.winnerTeam.teamName}`);
        console.log(`Match Date: ${this.matchDate}`)
        console.log(`Venue: ${this.venue}`)
    }
}