  /*
     * Copyright (c) 2011, Oracle and/or its affiliates. All rights reserved.
     * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
     *
     * This code is free software; you can redistribute it and/or modify it
     * under the terms of the GNU General Public License version 2 only, as
     * published by the Free Software Foundation.  Oracle designates this
     * particular file as subject to the "Classpath" exception as provided
    * by Oracle in the LICENSE file that accompanied this code.
    *
    * This code is distributed in the hope that it will be useful, but WITHOUT
    * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
    * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
    * version 2 for more details (a copy is included in the LICENSE file that
    * accompanied this code).
    *
    * You should have received a copy of the GNU General Public License version
    * 2 along with this work; if not, write to the Free Software Foundation,
    * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
    *
    * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
    * or visit www.oracle.com if you need additional information or have any
    * questions.
    */
   
   package com.apple.laf;
   
   import java.awt.*;
   import java.security.PrivilegedAction;
   import java.util.*;
   
   import javax.swing.*;
   import javax.swing.border.Border;
   import javax.swing.plaf.*;
   import javax.swing.plaf.basic.BasicLookAndFeel;
   
   import sun.swing.*;
  // import apple.laf.*;
   
//   import com.apple.resources.MacOSXResourceBundle;
   
   public class AquaLookAndFeel extends BasicLookAndFeel {
       static final String sOldPropertyPrefix = "com.apple.macos."; // old prefix for things like 'useScreenMenuBar'
       static final String sPropertyPrefix = "apple.laf."; // new prefix for things like 'useScreenMenuBar'
   
       // for lazy initalizers. Following the pattern from metal.
       private static final String PKG_PREFIX = "com.apple.laf.";
       private static final String kAquaImageFactoryName = PKG_PREFIX + "AquaImageFactory";
       private static final String kAquaFontsName = PKG_PREFIX + "AquaFonts";
   
       /**
        * Return a short string that identifies this look and feel, e.g.
        * "CDE/Motif".  This string should be appropriate for a menu item.
        * Distinct look and feels should have different names, e.g.
        * a subclass of MotifLookAndFeel that changes the way a few components
        * are rendered should be called "CDE/Motif My Way"; something
        * that would be useful to a user trying to select a L&F from a list
        * of names.
        */
       public String getName() {
           return "Mac OS X";
       }
   
       /**
        * Return a string that identifies this look and feel.  This string
        * will be used by applications/services that want to recognize
        * well known look and feel implementations.  Presently
        * the well known names are "Motif", "Windows", "Mac", "Metal".  Note
        * that a LookAndFeel derived from a well known superclass
        * that doesn't make any fundamental changes to the look or feel
        * shouldn't override this method.
        */
       public String getID() {
           return "Aqua";
       }
   
       /**
        * Return a one line description of this look and feel implementation,
        * e.g. "The CDE/Motif Look and Feel".   This string is intended for
        * the user, e.g. in the title of a window or in a ToolTip message.
        */
       public String getDescription() {
           return "Aqua Look and Feel for Mac OS X";
       }
   
       /**
        * Returns true if the <code>LookAndFeel</code> returned
        * <code>RootPaneUI</code> instances support providing Window decorations
        * in a <code>JRootPane</code>.
        * <p>
        * The default implementation returns false, subclasses that support
        * Window decorations should override this and return true.
        *
        * @return True if the RootPaneUI instances created support client side
        *             decorations
        * @see JDialog#setDefaultLookAndFeelDecorated
        * @see JFrame#setDefaultLookAndFeelDecorated
        * @see JRootPane#setWindowDecorationStyle
        * @since 1.4
       */
      public boolean getSupportsWindowDecorations() {
          return false;
      }
  
      /**
       * If the underlying platform has a "native" look and feel, and this
       * is an implementation of it, return true.
       */
      public boolean isNativeLookAndFeel() {
          return true;
      }
  
      /**
       * Return true if the underlying platform supports and or permits
       * this look and feel.  This method returns false if the look
       * and feel depends on special resources or legal agreements that
       * aren't defined for the current platform.
       *
       * @see UIManager#setLookAndFeel
       */
      public boolean isSupportedLookAndFeel() {
          return true;
      }
  
      /**
       * Returns an <code>ActionMap</code>.
       * <P>
       * This <code>ActionMap</code> contains <code>Actions</code> that
       * embody the ability to render an auditory cue. These auditory
       * cues map onto user and system activities that may be useful
       * for an end user to know about (such as a dialog box appearing).
       * <P>
       * At the appropriate time in a <code>JComponent</code> UI's lifecycle,
       * the ComponentUI is responsible for getting the appropriate
       * <code>Action</code> out of the <code>ActionMap</code> and passing
       * it on to <code>playSound</code>.
       * <P>
       * The <code>Actions</code> in this <code>ActionMap</code> are
       * created by the <code>createAudioAction</code> method.
       *
       * @return      an ActionMap containing Actions
       *              responsible for rendering auditory cues
       * @see #createAudioAction
       * @see #playSound(Action)
       * @since 1.4
       */
      protected ActionMap getAudioActionMap() {
          ActionMap audioActionMap = (ActionMap)UIManager.get("AuditoryCues.actionMap");
          if (audioActionMap != null) return audioActionMap;
  
          final Object[] acList = (Object[])UIManager.get("AuditoryCues.cueList");
          if (acList != null) {
              audioActionMap = new ActionMapUIResource();
              for (int counter = acList.length - 1; counter >= 0; counter--) {
                  audioActionMap.put(acList[counter], createAudioAction(acList[counter]));
              }
          }
          UIManager.getLookAndFeelDefaults().put("AuditoryCues.actionMap", audioActionMap);
  
          return audioActionMap;
      }
  
      /**
       * We override getDefaults() so we can install our own debug defaults
       * if needed for testing
       */
      public UIDefaults getDefaults() {
          final UIDefaults table = new UIDefaults();
          // use debug defaults if you want to see every query into the defaults object.
          //UIDefaults table = new DebugDefaults();
          try {
              // PopupFactory.getSharedInstance().setPopupType(2);
              initClassDefaults(table);
  
              // Here we install all the Basic defaults in case we missed some in our System color
              // or component defaults that follow. Eventually we will take this out.
              // This is a big negative to performance so we want to get it out as soon
              // as we are comfortable with the Aqua defaults.
              super.initSystemColorDefaults(table);
              super.initComponentDefaults(table);
  
              // Because the last elements added win in precedence we add all of our aqua elements here.
              initSystemColorDefaults(table);
              initComponentDefaults(table);
          } catch(final Exception e) {
              e.printStackTrace();
          }
          return table;
      }
  
      /**
       * Initialize the defaults table with the name of the ResourceBundle
       * used for getting localized defaults.  Also initialize the default
       * locale used when no locale is passed into UIDefaults.get().  The
       * default locale should generally not be relied upon. It is here for
       * compatability with releases prior to 1.4.
       */
      private void initResourceBundle(final UIDefaults table) {
          table.setDefaultLocale(Locale.getDefault());
          try {
//              final ResourceBundle aquaProperties = MacOSXResourceBundle.getMacResourceBundle(PKG_PREFIX + "resources.aqua");
//              final Enumeration<String> propertyKeys = aquaProperties.getKeys();
//  
//              while (propertyKeys.hasMoreElements()) {
//                  final String key = propertyKeys.nextElement();
//                  table.put(key, aquaProperties.getString(key));
//              }
          } catch (final Exception e) {
              table.addResourceBundle(PKG_PREFIX + "resources.aqua");
          }
      }
  
     protected void initSystemColorDefaults(final UIDefaults table) {
  //        String[] defaultSystemColors = {
  //                  "desktop", "#005C5C", /* Color of the desktop background */
  //          "activeCaption", "#000080", /* Color for captions (title bars) when they are active. */
  //          "activeCaptionText", "#FFFFFF", /* Text color for text in captions (title bars). */
  //        "activeCaptionBorder", "#C0C0C0", /* Border color for caption (title bar) window borders. */
  //            "inactiveCaption", "#808080", /* Color for captions (title bars) when not active. */
  //        "inactiveCaptionText", "#C0C0C0", /* Text color for text in inactive captions (title bars). */
  //      "inactiveCaptionBorder", "#C0C0C0", /* Border color for inactive caption (title bar) window borders. */
  //                 "window", "#FFFFFF", /* Default color for the interior of windows */
  //           "windowBorder", "#000000", /* ??? */
  //             "windowText", "#000000", /* ??? */
  //               "menu", "#C0C0C0", /* Background color for menus */
  //               "menuText", "#000000", /* Text color for menus  */
  //               "text", "#C0C0C0", /* Text background color */
  //               "textText", "#000000", /* Text foreground color */
 //          "textHighlight", "#000080", /* Text background color when selected */
 //          "textHighlightText", "#FFFFFF", /* Text color when selected */
 //           "textInactiveText", "#808080", /* Text color when disabled */
 //                "control", "#C0C0C0", /* Default color for controls (buttons, sliders, etc) */
 //            "controlText", "#000000", /* Default color for text in controls */
 //           "controlHighlight", "#C0C0C0", /* Specular highlight (opposite of the shadow) */
 //         "controlLtHighlight", "#FFFFFF", /* Highlight color for controls */
 //          "controlShadow", "#808080", /* Shadow color for controls */
 //            "controlDkShadow", "#000000", /* Dark shadow color for controls */
 //              "scrollbar", "#E0E0E0", /* Scrollbar background (usually the "track") */
 //               "info", "#FFFFE1", /* ??? */
 //               "infoText", "#000000"  /* ??? */
 //        };
 //
 //        loadSystemColors(table, defaultSystemColors, isNativeLookAndFeel());
     }
}