import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class YoutubeService {
  playlist = [
    {id: 'bdE_SyHad90', song: 'Robin Hustin x TobiMorrow - Light It Up (feat. Jex) [NCS Release]'},
    {id: 'HBYirj2c_jw', song: 'Deadpool 2 - Take on Me'},
    {id: 'N6O2ncUKvlg', song: 'Nelly - Just A Dream'},
    {id: 'uelHwf8o7_U', song: 'Eminem - Love The Way You Lie ft. Rihanna'},
    {id: 'WpYeekQkAdc', song: 'The Black Eyed Peas - Where Is The Love?'}
  ];

  constructor() { }
  find(id: string) {
    return this.playlist.find(item => item.id === id);
  }
}
