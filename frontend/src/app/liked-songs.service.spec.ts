import { TestBed } from '@angular/core/testing';

import { LikedSongsService } from './liked-songs.service';

describe('LikedSongsService', () => {
  let service: LikedSongsService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(LikedSongsService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
