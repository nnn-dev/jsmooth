// generated by Fast Light User Interface Designer (fluid) version 1.0108

#include "downloadgui.h"

Fl_Progress *hcg_progressbar=(Fl_Progress *)0;

Fl_Button *hcg_cancelbutton=(Fl_Button *)0;

Fl_Double_Window* make_window_downloadgui() {
  Fl_Double_Window* w;
  { Fl_Double_Window* o = new Fl_Double_Window(355, 61, "Downloading JAVA");
    w = o;
    { Fl_Tile* o = new Fl_Tile(0, 0, 355, 278);
      { hcg_progressbar = new Fl_Progress(0, 2, 355, 25);
      } // Fl_Progress* hcg_progressbar
      { Fl_Pack* o = new Fl_Pack(0, 29, 355, 31);
        { hcg_cancelbutton = new Fl_Button(70, 30, 215, 26, "Cancel");
        } // Fl_Button* hcg_cancelbutton
        { new Fl_Box(285, 37, 65, 20);
        } // Fl_Box* o
        { new Fl_Box(10, 37, 55, 20);
        } // Fl_Box* o
        o->end();
      } // Fl_Pack* o
      o->end();
    } // Fl_Tile* o
    o->end();
  } // Fl_Double_Window* o
  return w;
}
