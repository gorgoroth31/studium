# studium

> Durch unser Wissen unterscheiden wir uns nur wenig, in unserer grenzenlosen Unwissenheit aber sind wir alle gleich.
>
> ~ Karl Popper

Alle Erfahrungen, die ich im Verlauf des Studiums "Medizinische Informatik" an der Technischen Hochschule Ulm mache, werde ich hier teilen. Dazu zählen z. B. fachliche Inhalte oder andersweitige Erfahrungen, um das Studium interessanter zu machen.

## Setup

### Tex

Um meine Arbeiten mit LaTex zu schreiben, verwende ich auf meinem Linux-System folgenden [Workflow von timothyckl mit neovim und vimtex](https://timothyckl.com/posts/writing-latex/)
Anstelle des Tools 'skim' verwende ich zathura, das mit `sudo pacman -S zathura zathura-pdf-poppler` installiert werden kann. Außerdem muss in `vimtex.lua` der `vim.g.vimtex_view_method` als `zahtura` gesetzt werden.

#### Keybinds in normal mode

- \ll (compile)
- \lv (preview pdf file, funktioniert aber irgendwie nicht so wie es soll -> bei \ll wird das dokument einfach geupdated, vorausgesetzt, das Dokument wurde abgespeichert)
- \le (jump to first error)
