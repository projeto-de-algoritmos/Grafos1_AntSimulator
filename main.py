import pygame
import sys


pygame.init()

# Set up the display
screen_width = 850
screen_height = 800
screen = pygame.display.set_mode((screen_width, screen_height))

# Load background
background_image = pygame.image.load("antMenuRight.png").convert()

# Load font
font = pygame.font.SysFont("myfont.ttf", 50)

# Define menu
menu_items = ["  ", "Play", "Story", "Quit"]

# Set up menu options
menu_options = []
for i, item in enumerate(menu_items):
    text_surface = font.render(item, True, (0, 0, 0))
    text_rect = text_surface.get_rect(center=(screen_width / 2, 200 + i * 100))
    menu_options.append((text_surface, text_rect))


# Start the game loop
running = True
while running:
    # Handle events
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            running = False

    # Draw the background
    screen.blit(background_image, (0, 0))

    # Draw the menu options
    for option in menu_options:
        screen.blit(option[0], option[1])

    # Update the screen
    pygame.display.flip()

# Clean up
pygame.quit()
