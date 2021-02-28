export class SessionService
{
    allSessions:{sessionName:string,description:string,instructorName:string}[] = [
        {sessionName: 'React Native', description: 'React Native is an open-source mobile application framework created by Facebook, Inc. It is used to develop applications for Android, Android TV, iOS, macOS, tvOS, Web, Windows and UWP by enabling developers to use Reacts framework along with native platform capabilities.', instructorName: 'Tajammul Pasha'},
        {sessionName: 'Angular', description: 'Angular is a TypeScript-based open-source web application framework led by the Angular Team at Google and by a community of individuals and corporations. Angular is a complete rewrite from the same team that built AngularJS. ', instructorName: 'Santosh Kalisamy'},
        {sessionName: 'React', description: 'React is an open-source, front end, JavaScript library for building user interfaces or UI components. It is maintained by Facebook and a community of individual developers and companies. React can be used as a base in the development of single-page or mobile applications. ', instructorName: 'Dhruv Rana'}
    ];

    addSession(sessionName:string,description:string,instructorName:string)
    {
        this.allSessions.push({sessionName,description,instructorName});
    }
    updateSession(id:number,sessionName:string,description:string,instructorName:string)
    {
        this.allSessions[id].sessionName = sessionName;
        this.allSessions[id].description = description;
        this.allSessions[id].instructorName = instructorName;
    }
    deleteSession(id:number)
    {
        this.allSessions.splice(id,1);
    }

    getSession(id:number)
    {
        return this.allSessions[id];
    }

}